package com.cursor.hw3;

public class Application {

    public static void main(String[] args) {

        Car BMV = new Car("BMV", true, 35);
        System.out.println();
        BMV.startMotor();
        BMV.drive();
        BMV.speed();

        Circle circle = new Circle(10);
        circle.areaCircle();
        System.out.println("The area of the circle is " +
                (String.format("%.2f", circle.getCircle())));
    }
}
