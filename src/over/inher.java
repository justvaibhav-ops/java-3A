package over;
import java.util.*;
class Parent {
    public int a=10;
    public void account() {

        System.out.println("I have an account");

    }
}
    class Child extends Parent{
        int b = 20;
        public void user() {

            System.out.println(a + b);
            System.out.println("I have a Username");
        }
    }
    class Child2 extends Child{
    String s="Tony";
        public void name(){
            
            System.out.println("My name is  "+s);
        }
        }


public class inher {
    private static Object ch1;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Child2 ch1=new Child2();
        ch1.a=20;
        ch1.user();
        ch1.name();
        ch1.s="IronMan";
        ch1.name();
        
        

    }
}
