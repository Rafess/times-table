package com.letscode.table;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.print("Insira um numero interio: ");
        int value = numberScanner.nextInt();
        calculateTimesTable(value);
    }
    public static void calculateTimesTable(int value) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(value + " * " + i + " = " + (value * i));
        }
    }
}
