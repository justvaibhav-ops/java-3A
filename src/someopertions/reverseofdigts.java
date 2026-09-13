package someopertions;
import java.util.Scanner;
class rod{
    public int rods(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            System.out.println(rem);
            sum=sum*10+rem;
            System.out.println(sum);
            num=num/10;
            System.out.println(num);

        }

        return sum;
    }

}

public class reverseofdigts {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        rod obj = new rod();
        System.out.println("Enter a Number");
        System.out.println(obj.rods(sc.nextInt()));
    }
}
