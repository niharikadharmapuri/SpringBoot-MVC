package com.niharika;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
//        Logger logger = LogManager.getLogger(App.class);
//        logger.trace("this is trace");
//        logger.info("this is info ");
//        logger.warn("this is warn ");
//        logger.error("this is error ");
//        logger.fatal("this is fatal ");


    }
}
