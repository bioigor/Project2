package com.company.transport;

public class Car {

    public void transfer(Object luggage, String place) {
        if (tankLiters < 5) {
            System.out.println("Поездка невозможна, мало топлива");
            return;
        }
        System.out.printf("Перевожу %s в %s\n", luggage, place);
    }

    int tankLiters;

    public void fillUp(int liters) {
        tankLiters += liters;
        System.out.println("Заправили на " + liters + "литров");
    }
}

