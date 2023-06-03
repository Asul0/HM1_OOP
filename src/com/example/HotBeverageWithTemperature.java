package com.example;

class HotBeverageWithTemperature extends HotBeverage {
    private int temperature;

    public HotBeverageWithTemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
