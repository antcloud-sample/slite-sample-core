package com.alipay.demo;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class SampleServiceImpl implements SampleService {

    @Override
    public String message() {
        try {
            return "Hello, my IP is " + Inet4Address.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "Hello, something went wrong, I can't find my IP.";
        }
    }
}
