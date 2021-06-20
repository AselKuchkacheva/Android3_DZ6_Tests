package com.example.android3_dz6_tests;

public class Math {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int degree(int number, int degree) {
        int tempNum = number;
        for (int i = 1; i < degree; i++) {
            number = number * tempNum;
        }
        return number;
    }

    public int root(int number) {
        int chislo = (int) java.lang.Math.sqrt(number);
        return chislo;
    }

}
