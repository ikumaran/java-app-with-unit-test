package com.kumaran.sampleappwithunittest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AssertionErrors;

@SpringBootTest
class CalcServiceTest {

    @Autowired
    private CalcService calcService;

    @Test
    public void addTest() {
        int sum = calcService.add(1, 2);
        AssertionErrors.assertEquals("result not matching", 3, sum);
    }

    @Test
    public void addTest_null() {
        int sum = calcService.add();
        AssertionErrors.assertEquals("result not matching", 0, sum);
    }
    @Test
    public void divideTest() {
        int divide = calcService.divide(0, 1);
        AssertionErrors.assertEquals("result not matching", 0, divide);
    }

    @Test
    public void divideTest_zeroDivider() {
        Assertions.assertThrows(ArithmeticException.class, () -> calcService.divide(0, 0));
    }

}