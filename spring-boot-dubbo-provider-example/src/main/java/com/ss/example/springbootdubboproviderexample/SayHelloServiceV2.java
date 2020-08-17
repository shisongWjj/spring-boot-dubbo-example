package com.ss.example.springbootdubboproviderexample;

import com.ss.example.ISayHelloService;
import org.apache.dubbo.config.annotation.Argument;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;

/**
 * SayHelloService
 *
 * @author shisong
 * @date 2020-08-11
 */
@DubboService(registry = {"shanghai","hunan"},version = "2.0",methods = {
        @Method(name = "sayHello",arguments = {
                @Argument()
        })
})
public class SayHelloServiceV2 implements ISayHelloService {
    @Override
    public String sayHello(String name) {
        return name + " say hello world 2.0";
    }
}
