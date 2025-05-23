package com.vitalink.demovitalink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;

@RestController
public class TestController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/test-db")
    public String testDatabase() {
        try {
            Connection connection = dataSource.getConnection();
            String info = "✅ Conexión exitosa a la base de datos MySQL!\n" +
                    "Database: " + connection.getCatalog() + "\n" +
                    "URL: " + connection.getMetaData().getURL();
            connection.close();
            return info;
        } catch (Exception e) {
            return "❌ Error de conexión: " + e.getMessage();
        }
    }
}
