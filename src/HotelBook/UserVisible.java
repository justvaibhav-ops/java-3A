package HotelBook;
import java.util.*;


import java.util.List;

public class UserVisible {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int total=1111;

        HotelData hd=new HotelData();
        System.out.println("Available Hotels");
        List<Hotel> list=hd.storeAllHotels();
        for (Hotel h:list){
            System.out.println(h.getName()+" "+h.getPrice());
        }
        System.out.println("Enter your preferred hotel");
        String hot1=sc.nextLine();
        System.out.println("How many days u going to stay there ?");
        int days=sc.nextInt();
        for(Hotel h:list){
            if(h.getName().equals(hot1)){
                total=h.getPrice()*days;

            }

        }
        System.out.println("Your total amount for "+days+"days would be "+total);
        System.out.println("Would you like to Choose this as your stay ?");
        String y=sc.next();


    }
}
