package lamda.dutta.riddhi.withlamda;


        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public class Main {
    public static void main(String[] args) {

        HotelServiceSingleMethod hotelService = new HotelServiceSingleMethod();
//        List<Hotel> hotelList = hotelService.filterHotels((Hotel hotel) -> {                        //here we are not writing class name we are pass the argument
//        List<Hotel> hotelList = hotelService.filterHotels( hotel -> {                           //type inference
//            return hotel.getPricePerNight() < 20000;
//        });

        //lambda expression inside a reference
        HotelFilteringCondition lambdaExp = hotel -> hotel.getPricePerNight() <= 1000;              // type of reference variable will always be the interface
        List<Hotel> hotelList = hotelService.filterHotels(lambdaExp);
        System.out.println("List of hotel"+hotelList);

//        List<Integer> list = List.of(1,2,3,5);
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 5));
        Collections.sort(list,(Integer a, Integer b) -> b-a);               // no return statement and no ; at the end. Here we are passing compare method as parameter
        System.out.println(list);
    }
}
