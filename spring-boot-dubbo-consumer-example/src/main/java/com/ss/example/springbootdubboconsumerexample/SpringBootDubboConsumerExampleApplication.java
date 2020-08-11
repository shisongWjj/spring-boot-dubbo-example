package com.ss.example.springbootdubboconsumerexample;

import com.ss.example.ISayHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDubboConsumerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubboConsumerExampleApplication.class, args);
    }

    @DubboReference
    private ISayHelloService sayHelloService;

    @RequestMapping("/test")
    public String test(){
        return sayHelloService.sayHello("shisong");
    }

}
