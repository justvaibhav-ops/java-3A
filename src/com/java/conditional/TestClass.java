package com.java.conditional;
import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int a=sc.nextInt();
        if(a>=18){
            System.out.println("You can Vote ");
        }
        else {
            System.out.println("Sorry, You are not eligible to vote");
        }

    }
}