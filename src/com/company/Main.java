package com.company;

import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

}

