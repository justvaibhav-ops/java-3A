package com;
import java.util.Scanner;
class jump{
    public void checkdiv(int start,int end){
        int i=start;
        int c1=0,c2=0,c3=0;
        for(;i<=end;){
            if(i%3==0){
                c1++;
            }
            if(i%4==0){
                c2++;
            }
            if(i%5==0){
                c3++;
            }
            i++;

        }
        System.out.println("Numbers divisible by 3:"+c1);
        System.out.println("Numbers divisible by 4:"+c2);
        System.out.println("Numbers divisible by 5:"+c3);
    }


}

public class div {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        jump obj=new jump();
        System.out.println("Enter Range");
        obj.checkdiv(sc.nextInt(),sc.nextInt());

    }
}
