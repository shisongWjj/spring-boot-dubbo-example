package com.ss.example.springbootdubboconsumerexample;

import com.ss.example.ISayHelloService;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.rpc.cluster.ConfiguratorFactory;
import org.apache.dubbo.rpc.cluster.LoadBalance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDubboConsumerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubboConsumerExampleApplication.class, args);
        LoadBalance ssLoadBalance = ExtensionLoader.getExtensionLoader(LoadBalance.class).getExtension("ssLoadBalance");
        System.out.println(ssLoadBalance);
    }

    @DubboReference(version = "2.0")
    private ISayHelloService sayHelloService;

    @RequestMapping("/test")
    public String test(){
        return sayHelloService.sayHello("shisong");
    }

}
