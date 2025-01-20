package com.uinme.call;

import java.io.FileNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

@Component
@Scope("singleton")
public class Service {
    
    private Logger logger = LoggerFactory.getLogger(Service.class);
    
    @Autowired
    ResourceLoader resourceLoader;

    public void run() {
        System.out.println("service running.");
        
        try {
            logger.info(ResourceUtils.getFile("classpath:conf/properties/spring-jdbc.properties").toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
