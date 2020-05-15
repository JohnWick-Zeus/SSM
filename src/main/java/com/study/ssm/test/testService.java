package com.study.ssm.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class testService {

    @Before
    public void setUp(){
        System.out.println("start");
    }

    @After
    public void done(){
        System.out.println("end");
    }

    @Test
    public void test(){
        System.out.println("success");
    }
}
