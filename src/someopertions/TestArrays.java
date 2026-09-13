package someopertions;
import java.util.*;

public class TestArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        String s;
        System.out.println("Enter a String ");
        s=sc.nextLine();
        int arr[]=new int[s.length()];
        System.out.println("Enter elements");
        for(i=0;i<s.length();i++) {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<s.length();i++) {
            System.out.println(arr[i]);
        }



//            System.out.print(s.charAt(i));
//            System.out.print(i+1);



        }
    }

