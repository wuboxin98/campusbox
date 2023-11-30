package com.campusbox.main.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName: MyWebConfig
 * Package: com.campusbox.main.config
 *
 * @Author boxin
 * @Create 2023/11/30 20:28
 * @Version 1.0
 * @Description:
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 对所有的路径应用CORS配置
                .allowedOrigins("http://localhost:8080") // 允许所有来源
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS") // 允许的HTTP方法
                .allowedHeaders("*") // 允许所有头部
                .allowCredentials(true); // 允许携带认证信息(如cookies)
    }
}
