package HotelBook;
import java.util.*;


public class HotelData {
    public  List<Hotel> storeAllHotels(){


    Hotel h1=new Hotel(1,"PARADISE","l1",8000);
    Hotel h2=new Hotel(2,"Sarovar","l1",10000);
    Hotel h3=new Hotel(3,"Opulent","l1",12000);

    List<Hotel> hotels=new ArrayList<Hotel>();
    hotels.add(h1);
        hotels.add(h2);
        hotels.add(h3);
        return hotels;


    }
}
