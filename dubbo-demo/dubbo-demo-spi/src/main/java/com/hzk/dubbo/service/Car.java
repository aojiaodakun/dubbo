package com.hzk.dubbo.service;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

//@SPI
@SPI(value = "black")
public interface Car {

    @Adaptive(value = "carType")
    void getColor(URL url);

}
