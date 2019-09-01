package com.hpt.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
public class FileController  {
	
	private static final Logger logger = LoggerFactory.getLogger(FileController.class);

	 @RequestMapping("/downloadFile")
	private String downloadFile(HttpServletResponse response ,HttpServletRequest request){
        String downloadFilePath = "../pics/";//被下载的文件在服务器中的路径,
        String fileName = request.getParameter("1564726005632_5bc69bcfN8030a03e.jpg");//被下载文件的名称
        
        File file = new File(downloadFilePath);
        if (file.exists()) {
            response.setContentType("application/force-download");// 设置强制下载不打开            
            response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            
            
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream outputStream = response.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    outputStream.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
              
                return "下载成功";
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
       return "下载失败";    
    }
	 

	     @RequestMapping(value = "upload")
	     @ResponseBody
	     public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
	    	 System.out.println(request.getParameter("test"));
	         if (file.isEmpty()) {
	             return "文件为空";
	         }

	         // 获取文件名
	         String fileName = file.getOriginalFilename();
	         logger.info("上传的文件名为：" + fileName);

	         // 获取文件的后缀名
	         String suffixName = fileName.substring(fileName.lastIndexOf("."));
	         logger.info("上传的后缀名为：" + suffixName);

	         // 文件上传路径
	         String filePath = "D:/temp/";

	         // 解决中文问题，liunx下中文路径，图片显示问题
	         // fileName = UUID.randomUUID() + suffixName;
	         
	         File dest = new File(filePath + fileName);

	         // 检测是否存在目录
	         if (!dest.getParentFile().exists()) {
	             dest.getParentFile().mkdirs();
	         }

	         try {
	             file.transferTo(dest);
	             return "上传成功";
	         } catch (IllegalStateException e) {
	             e.printStackTrace();
	         } catch (IOException e) {
	             e.printStackTrace();
	         }
	         return "上传失败";
	     }

}
