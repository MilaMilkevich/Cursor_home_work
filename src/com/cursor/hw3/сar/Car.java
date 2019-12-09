package com.cursor.hw3.сar;

public class Car {
    private String model;
    private boolean start;
    private double speed;

    public void startMotor() {
        if (start) {
            System.out.println(model + " " + "started up.");
        } else {
            System.out.println("Motor is muffled.");
        }
    }

    public void drive() {
        if (start) {
            if (speed > 0) {
                System.out.println(model + " " + "rides.");
            }
        } else {
            System.out.println(model + " " + "is standing.");
        }
    }

    public void speed() {
        if (start && speed > 50) {
            System.out.println("Over speed.");
        } else if (start && speed <= 50) {
            System.out.println(model + " " + "moves with speed " + " " + speed + " " + " kilometers per hour.");
        }
    }

    public Car(String model, boolean start, double speed) {
        this.model = model;
        this.start = start;
        this.speed = speed;
    }
}



