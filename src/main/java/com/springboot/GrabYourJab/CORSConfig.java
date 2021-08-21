package com.springboot.GrabYourJab;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CORSConfig implements WebMvcConfigurer {

@Override
public void addCorsMappings(CorsRegistry registry) {
      registry.addMapping("http://localhost:4200").allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");     
}
}