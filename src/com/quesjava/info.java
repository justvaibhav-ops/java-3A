import javax.xml.transform.Source;
import java.util.*;
class user{
    static String name;
    static int age;

    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your age");
        age= sc.nextInt();
    }
    void display(){
        System.out.println("YOUR DETAILS");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class info{
    public static void main(String args[]) {
        user obj=new user();
        obj.getdata();
            if(user.age>18){
        obj.display();
            }
        else {
                System.out.println("Sorry you can't enter details");
            }

    }



}