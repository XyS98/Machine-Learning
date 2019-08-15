package com.hpt.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @program: idea_run
 * @description: Servlet启动监听器，创建文件夹
 * @author: xh
 * @create: 2019-07-29 09:22
 */
@WebListener
public class ApplicationListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
//        String filePath = "pics";
//        //获取初始化参数uploadPath
//        String temp = sce.getServletContext().getInitParameter("uploadPath");
//        if(temp != null && !"".equals(temp)) {
//            filePath = temp;
//        }
//        //当前项目在服务器中的绝对位置
//        //判断这个目录是否已经存在
//        String path =  sce.getServletContext().getRealPath("/");
//        File fl = new File(path, "../" + filePath);
//        if (!fl.exists()) {
//            fl.mkdirs();
//        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
