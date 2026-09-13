package com.java;

import java.util.Scanner;
class test {

    public String checkevenodd(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }

    }

public class testevenodd {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
            int a=sc.nextInt();
            test t=new test();
            t.checkevenodd(a);


    }
}
}
