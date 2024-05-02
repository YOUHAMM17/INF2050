package com.example.java_test;

public class HelloWorldLambda {
    public static void main(String[] args) {
        // Définition d'une interface fonctionnelle
        Interface Printer = msg -> System.out.println(msg);

        // Appel de la méthode print avec une expression lambda
        Printer.print("hello world");
    }

    // Interface fonctionnelle avec une méthode abstraite
    interface Interface {
        void print(String msg);
    }
}