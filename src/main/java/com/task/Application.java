package com.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Application类说明自己是Spring Boot的入口类，那么需要加入@Configuration注解。
 * 
 * 习惯放在主方法类Application上@EnableAutoConfiguration，当项目运行时，Spring容器去自动查找带特定注解的类，如：带@Entity、@Service等类
 * 
 * 如果不带basePackage 属性的话@ComponentScan，它会自动扫描以入口类所在的包为父节点下所有子包下的类。这也是Spring Boot会提议我们把Application类放于根包路径下。
 * 
 * *****/
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
