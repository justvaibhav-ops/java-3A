package com;

import java.util.Scanner;

class Test {

    public String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}

class TestEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        Test t = new Test();
        System.out.println(t.checkEvenOdd(a));


    }
}