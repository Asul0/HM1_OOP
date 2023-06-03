package com.example;

interface VendingMachine {
    HotBeverage getProduct(String name, int volume);
    HotBeverageWithTemperature getProduct(String name, int volume, int temperature);
}
