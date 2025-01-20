package com.uinme.call;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.uinme.call.config.AppConfig;

public class App {
    
    private static Logger logger = LoggerFactory.getLogger(App.class);
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Service service = ctx.getBean(Service.class);

        logger.info("Start application.");
        
        service.run();

        ctx.close();
    }
}
