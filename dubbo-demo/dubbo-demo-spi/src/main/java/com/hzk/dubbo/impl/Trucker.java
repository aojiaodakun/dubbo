package com.hzk.dubbo.impl;

import com.alibaba.dubbo.common.URL;
import com.hzk.dubbo.service.Car;
import com.hzk.dubbo.service.Driver;

public class Trucker implements Driver {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void driverCar(URL url) {
        car.getColor(url);
    }
}
