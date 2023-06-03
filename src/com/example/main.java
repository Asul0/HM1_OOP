package com.example;

public class main {
    public static void main(String[] args) {
        // Создание экземпляра класса HotBeverage (Горячий напиток)
        HotBeverage tea = new HotBeverage("Чай", 200);
        System.out.println("Название: " + tea.getName());
        System.out.println("Объем: " + tea.getVolume());

        // Создание экземпляра класса HotBeverageWithTemperature (Горячий напиток с температурой)
        HotBeverageWithTemperature coffee = new HotBeverageWithTemperature("Кофе", 300, 70);
        System.out.println("Название: " + coffee.getName());
        System.out.println("Объем: " + coffee.getVolume());
        System.out.println("Температура: " + coffee.getTemperature());

        // Создание экземпляра класса HotBeverageVendingMachine (Горячих напитков автомат)
        HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine();

        // Получение продукта из автомата
        HotBeverage teaFromMachine = vendingMachine.getProduct("Чай", 200);
        System.out.println("Название: " + teaFromMachine.getName());
        System.out.println("Объем: " + teaFromMachine.getVolume());

        HotBeverageWithTemperature coffeeFromMachine = vendingMachine.getProduct("Кофе", 300, 70);
        System.out.println("Название: " + coffeeFromMachine.getName());
        System.out.println("Объем: " + coffeeFromMachine.getVolume());
        System.out.println("Температура: " + coffeeFromMachine.getTemperature());
    }
}