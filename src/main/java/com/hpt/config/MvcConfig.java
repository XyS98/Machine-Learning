package com.hpt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: idea_run
 * @description: mvc控制器配置，将访问转向WEB-INF下
 * @author: xh
 * @create: 2019-08-08 14:51
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**").addResourceLocations("/templates");
//        
//        
//        /**
//         * 原因是因为默认路径虽然是在static下，但并没有包含static 下的各个文件夹
//         * ，因此当我们把静态文件移入这些文件夹后，spring boot就不认识了。因此，为了让spring boot认识，
//         * 我们需要添加一个配置类来把我们自己的路径添加进去，具体代码如下
//         */
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//    }
    
    
}
