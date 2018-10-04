package com.niharika;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class App
{
    public static void main( String[] args ){

        SpringApplication app= new SpringApplication(App.class);
        app.run();
    }
}
