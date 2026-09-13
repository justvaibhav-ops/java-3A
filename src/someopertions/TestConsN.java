package someopertions;
import java.util.*;
class TestCons {
    public TestCons() {
        System.out.println("Hii from a constructor ");
    }

    public TestCons(int a) {
        System.out.println("Hii from a constructor " + a);
    }
}
    class callprev extends TestCons{
        public void call(){
            System.out.println("Hii from Call");
        }
    }



public class TestConsN {
    public static void main(String[] main) {
        Scanner sc=new Scanner(System.in);
        callprev obj=new callprev();
        //obj.call();
        System.out.println("Enter a Number ");
        int n=sc.nextInt();
        if(n>3&&n<20){
            TestCons tc=new TestCons(n);

        }






    }


}