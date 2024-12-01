package lamda.dutta.riddhi.withoutlamda;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        //using normal service class
        HotelService hotelServiceNormal = new HotelService();
        List<Hotel> filterHotelLessThan = hotelServiceNormal.filterHotelLessThan(20000);
        System.out.println("Using normal service class, hotels less than 2000 price"+filterHotelLessThan);

        //Using single method service class
        HotelServiceSingleMethod hotelService = new HotelServiceSingleMethod();
        List<Hotel> hotelList = hotelService.filterHotels(new FilterHotelLessThan20000());             //inside filterHotels, user need to pass the required condition and here the condition is store in FilterHotelLessThan20000
        System.out.println("List of hotel"+hotelList);

        //5 five-star hotels
        List<Hotel> fiveStarHotelList = hotelService.filterHotels(new FilterFiveStarHotel());
        System.out.println("List of five star hotel"+fiveStarHotelList);*/

        //using anonymous class
        HotelServiceSingleMethod hotelService = new HotelServiceSingleMethod();
        List<Hotel> hotelList = hotelService.filterHotels(new HotelFilteringCondition() {                       //anonymous inner class
            @Override
            public boolean test(Hotel hotel) {
                return hotel.getPricePerNight() < 20000;
            }
        });
        System.out.println("List of hotels"+hotelList);

    }
}
