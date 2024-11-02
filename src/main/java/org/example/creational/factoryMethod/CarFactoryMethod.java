package org.example.creational.factoryMethod;

import org.example.creational.factoryMethod.product.Car;

public abstract class CarFactoryMethod {
    public void start(){
        var car = createCar();
        car.start();
    }
    abstract Car createCar();
}
