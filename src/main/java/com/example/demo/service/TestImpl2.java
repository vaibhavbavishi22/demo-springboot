package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("2")
public class TestImpl2 implements Test{

    @Override
    public String sendPrint(String animal){
        return "Penguin";
    }
}
