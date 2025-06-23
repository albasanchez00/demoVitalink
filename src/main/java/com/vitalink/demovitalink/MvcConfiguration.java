package com.vitalink.demovitalink;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
@Configuration
public class MvcConfiguration {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/inicioSesion").setViewName("inicioSesion");

    }
}
