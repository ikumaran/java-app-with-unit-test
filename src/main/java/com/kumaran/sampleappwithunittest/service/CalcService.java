package com.kumaran.sampleappwithunittest.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CalcService {

    public int add(int... input) {
        return Arrays.stream(input).sum();
    }

    public int divide(int first, int second) {
        return first / second;
    }
}
