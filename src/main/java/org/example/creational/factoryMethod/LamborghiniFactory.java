package org.example.creational.factoryMethod;

import org.example.creational.factoryMethod.CarFactoryMethod;
import org.example.creational.factoryMethod.product.Car;
import org.example.creational.factoryMethod.product.Lamborghini;

public class LamborghiniFactory extends CarFactoryMethod {
    @Override
    Car createCar() {
        return new Lamborghini();
    }
}
