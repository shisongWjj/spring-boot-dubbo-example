package com.ss.example.springbootdubboproviderexample;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan("com.ss.example.springbootdubboproviderexample")
@SpringBootApplication
public class SpringBootDubboProviderExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubboProviderExampleApplication.class, args);
    }

}
