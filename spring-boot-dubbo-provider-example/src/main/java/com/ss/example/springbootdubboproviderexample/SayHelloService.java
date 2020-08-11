package com.ss.example.springbootdubboproviderexample;

import com.ss.example.ISayHelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * SayHelloService
 *
 * @author shisong
 * @date 2020-08-11
 */
@DubboService
public class SayHelloService implements ISayHelloService {
    @Override
    public String sayHello(String name) {
        return name + " say hello world";
    }
}
