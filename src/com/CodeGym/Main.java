package com.CodeGym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số USD");
        float USD = scanner.nextFloat();
        float VND = USD * 23000;
//        System.out.println(USD + " USD = " + VND + " VND");
        System.out.printf("%.2f USD %.2f VND", USD, VND);
    }
}
