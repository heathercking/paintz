package com.codeclan.example.paintzServer.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringGlobalConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/paints")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("X-Requested-With", "Origin", "Content-Type", "Accept", "Authorization", "Access-Control-Allow-Origin")
                .exposedHeaders("X-Requested-With", "Origin", "Content-Type", "Accept", "Authorization", "Access-Control-Allow-Origin")
                .allowCredentials(true);
    }

//    private static final String CORS_BASE_PATTERN = "/**";
//    private static final String ALLOWED_ORIGINS = "*";
//    private static final String ALLOWED_HEADERS = "*";
//    private static final String ALLOWED_METHODS = "*";
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping(CORS_BASE_PATTERN)
//                .allowedOrigins(ALLOWED_ORIGINS)
//                .allowedHeaders(ALLOWED_HEADERS)
//                .allowedMethods(ALLOWED_METHODS);
//    }


}
