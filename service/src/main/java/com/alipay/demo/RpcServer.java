package com.alipay.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RpcServer {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("META-INF/spring/rpc_server.xml");
    }
}
