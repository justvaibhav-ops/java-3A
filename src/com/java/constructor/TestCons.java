package com.java.constructor;
class Call{
    public Call(){//Constructor is always Public
        System.out.println("Object init");
        add();
        Sub obj=new Sub();



    }
    public static void add(){
        System.out.println("Call Method");
    }
}


public class TestCons {
   public static void main(String args[]) {
       //new Call();
       Call obj=new Call();//new is used for Dynamic Memory allocation
       //System.out.println(obj);

    }
}
 class Sub {
    Sub() {
        System.out.println("Sub");
    }
    
}
