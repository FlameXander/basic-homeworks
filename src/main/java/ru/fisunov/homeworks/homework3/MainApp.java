package ru.fisunov.homeworks.homework3;

public class MainApp {
    public static void main(String[] args) {
        sum(1, 1);
        sum2(2, 2, 2);
    }

    public static void sum(int a, int b) {
        System.out.println(a + b - 1);
    }

    public static void sum2(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
