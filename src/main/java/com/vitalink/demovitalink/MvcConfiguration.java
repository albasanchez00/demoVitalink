package com.vitalink.demovitalink;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

public class MvcConfiguration {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/inicioSesion").setViewName("inicioSesion");

    }
}
