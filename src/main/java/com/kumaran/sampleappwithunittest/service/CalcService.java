package com.kumaran.sampleappwithunittest.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public int add(Integer first, Integer second) {
        return first + second;
    }

    public int divide(int first, int second) {
        if (second == 0) {
            throw new NumberFormatException("bad input for second parameter");
        }
        return first / second;
    }
}
