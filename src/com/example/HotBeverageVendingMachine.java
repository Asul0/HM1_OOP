package com.example;

class HotBeverageVendingMachine implements VendingMachine {
    public HotBeverage getProduct(String name, int volume) {
        return new HotBeverage(name, volume);
    }

    public HotBeverageWithTemperature getProduct(String name, int volume, int temperature) {
        return new HotBeverageWithTemperature(name, volume, temperature);
    }
}