package com.cym2050.factorymethod;
/**
 * 简单工厂可扩展性不好
 */
public class SimpleVehicleFactory {
    public Car createCar() {
        return new Car();
    }
    public Broom createBroom() {
        return new Broom();
    }
}
