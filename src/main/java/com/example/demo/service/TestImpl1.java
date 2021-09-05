package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("1")
public class TestImpl1 implements Test{

    @Override
    public String sendPrint(String animal){
        StringBuilder sb = new StringBuilder();
        sb.append("My");
        sb.append("name");

        return "Tiger";
    }
}
