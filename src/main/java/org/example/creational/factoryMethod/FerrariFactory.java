package org.example.creational.factoryMethod;

import org.example.creational.factoryMethod.product.Car;
import org.example.creational.factoryMethod.product.Ferrari;

public class FerrariFactory extends CarFactoryMethod {
    @Override
    Car createCar() {
        return new Ferrari();
    }
}
