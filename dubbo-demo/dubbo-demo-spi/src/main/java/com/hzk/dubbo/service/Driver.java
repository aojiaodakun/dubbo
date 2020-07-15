package com.hzk.dubbo.service;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface Driver {

    void driverCar(URL url);
}
