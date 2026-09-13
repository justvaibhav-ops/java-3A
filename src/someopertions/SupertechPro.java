package someopertions;
import java.util.*;
abstract class supertech{
//    abstract void onebhk();
//
//    abstract void twobhk();
//
//    abstract void threebhk();
    abstract void printbhk();

}
class firm1 extends supertech {
    void printbhk() {
        System.out.println("One BHK");
    }
}
class firm2 extends supertech {
     void printbhk() {
        System.out.println("One and Two BHK");
    }
}
class firm3 extends supertech {
     void printbhk() {
        System.out.println("One,Two and Three BHK");
    }
}

public class SupertechPro {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which firm u wanna choose");
        System.out.println("1 for FIRM 1 ");
        System.out.println("2 for FIRM 2 ");
        System.out.println("3 for FIRM 3 ");

        int a = sc.nextInt();
        switch (a) {


            case 1:
                firm1 f1 = new firm1();
                f1.printbhk();
                break;
            case 2:
                firm2 f2 = new firm2();
                f2.printbhk();
                break;
            case 3:
                firm3 f3 = new firm3();
                f3.printbhk();
                break;
            default:
                System.out.println("INVALID INPUT");


        }
    }
}
