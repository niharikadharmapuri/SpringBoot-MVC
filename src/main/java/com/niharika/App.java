package com.niharika;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;


@SpringBootApplication
public class App
{
    public static void main( String[] args ){
        SpringApplication app= new SpringApplication(App.class);
        app.run();
    }
}
