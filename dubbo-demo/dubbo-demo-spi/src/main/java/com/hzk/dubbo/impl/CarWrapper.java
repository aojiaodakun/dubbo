package com.hzk.dubbo.impl;

import com.alibaba.dubbo.common.URL;
import com.hzk.dubbo.service.Car;

/**
 * dubbo-spi包装类
 */
public class CarWrapper implements Car {

    private Car car;

    public CarWrapper(Car car) {
        this.car = car;
    }

    @Override
    public void getColor(URL url){
        System.out.println("before...");
        car.getColor(url);
        System.out.println("after...");
    }

}
