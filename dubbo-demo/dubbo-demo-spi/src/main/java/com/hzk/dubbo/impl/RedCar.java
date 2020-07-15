package com.hzk.dubbo.impl;

import com.alibaba.dubbo.common.URL;
import com.hzk.dubbo.service.Car;

public class RedCar implements Car {
    @Override
    public void getColor(URL url) {
        System.out.println("red");
    }
}
