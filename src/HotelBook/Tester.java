package HotelBook;

//import java.util.List;
import java.util.*;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to add more hotels Y or N");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Enter the Password");
            String pass = sc.next();
            if (pass.equals("1234")) {
                InsertHotel.AddHotel();

//            Tester.main(args);
            }
            else {

                List<Hotel> list = UserVisible.avaiableHotels();
                System.out.println(UserVisible.enterUserData());


            }
        }
    }
}