package com.cxl.toolproj.configuration;

import com.cxl.toolproj.interceptor.AuthorizationInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Chenxiaoling
 * @date 2020/4/7 1:59 下午
 */
public class WebAppConfiguration implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthorizationInterceptor()).addPathPatterns("/**");
    }
}
