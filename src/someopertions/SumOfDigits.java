package someopertions;

import java.util.Scanner;
 class sumof {
    public int sumo(int num) {
        int sum = 0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return sum;
    }
}


public class SumOfDigits {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sumof so=new sumof();
        System.out.println("Enter a number");
        System.out.println(so.sumo(sc.nextInt()));


    }
}
