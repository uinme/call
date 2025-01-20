package com.uinme.call.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.uinme.call.App;

@Configuration
@ComponentScan(basePackageClasses = App.class)
public class AppConfig {

}
