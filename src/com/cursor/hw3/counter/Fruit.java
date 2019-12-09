package com.cursor.hw3.counter;

public class Fruit {
    static int count = 0;

    public Fruit() {
        count++;
    }

    public static void main(String[] args) {
        Fruit banana = new Fruit();
        Fruit orange = new Fruit();
        Fruit apple = new Fruit();
        System.out.println("There are " + count + " fruit in box.");
    }
}
