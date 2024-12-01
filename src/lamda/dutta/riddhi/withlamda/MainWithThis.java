package lamda.dutta.riddhi.withlamda;

import java.util.List;

public class MainWithThis {

    private int field;
    public List<Hotel> testLamda(){
        HotelServiceSingleMethod hotelService = new HotelServiceSingleMethod();

//    this                  // this refer to the MainWithThis class not the inner the class
        HotelFilteringCondition lambdaExp = hotel -> {
            return hotel.getPricePerNight() <= 1000;
        };

        return hotelService.filterHotels(lambdaExp);

    }

    public static void main(String[] args) {

    }
}
