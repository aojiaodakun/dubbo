package com.hzk.dubbo;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.hzk.dubbo.service.Car;
import com.hzk.dubbo.service.Driver;

import java.util.HashMap;
import java.util.Map;

public class CarDemo {

    public static void main(String[] args) {
        /**
         * car
         */
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        Car redCar = extensionLoader.getExtension("red");
        redCar.getColor(null);

        // 默认实现。Car接口需要加@SPI(value = "black")
        Car car = extensionLoader.getExtension("true");
        car.getColor(null);

        System.out.println("-----------------------");
        Car blackCar = extensionLoader.getExtension("black");
        blackCar.getColor(null);

        System.out.println("-----------------------");
        /**
         * driver
         */
        ExtensionLoader<Driver> driverExtensionLoader = ExtensionLoader.getExtensionLoader(Driver.class);
        Driver driver = driverExtensionLoader.getExtension("trucker");

        Map<String,String> map = new HashMap<>();
        map.put("carType","red");
        URL url = new URL("","",0,map);
        driver.driverCar(url);


    }

}
