package org.example.creational.factoryMethod;

import org.example.creational.factoryMethod.product.Car;

public class Client {
    public static void main(String[] args) {
        CarFactoryMethod factoryMethod = new FerrariFactory();
        factoryMethod.start();
    }
}
