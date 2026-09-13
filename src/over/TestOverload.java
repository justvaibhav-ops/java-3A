package over;

import java.util.Scanner;

class over{
    public void mul(int a){
        int b=10;
        System.out.println(a*b);
    }
    public void mul(int a,int b){
        System.out.println(a*b);
    }
}
public class TestOverload {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        over obj=new over();
        System.out.println("Enter a number");
        obj.mul(sc.nextInt());
        System.out.println("Enter two numbers");
        obj.mul(sc.nextInt(),sc.nextInt());

    }
}
