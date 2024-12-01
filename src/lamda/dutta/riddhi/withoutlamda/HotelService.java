package lamda.dutta.riddhi.withoutlamda;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel> hotelList = new ArrayList<>();

    public HotelService() {
        hotelList.add(new Hotel(2000,2, HotelType.THREE_STAR));
        hotelList.add(new Hotel(1000,1, HotelType.THREE_STAR));
        hotelList.add(new Hotel(10000,4, HotelType.FOUR_STAR));
        hotelList.add(new Hotel(20000,5, HotelType.FIVE_STAR));
    }

    //method to retrieve hotel whose price less than the passed price
    public List<Hotel> filterHotelLessThan(int price){
        List<Hotel> filteredHotels = new ArrayList<>();

        for (Hotel hotels : hotelList){
            if (isHotelLessThan(price, hotels)){
                filteredHotels.add(hotels);
            }
        }
        return filteredHotels;
    }

    private boolean isHotelLessThan(int price, Hotel hotel) {
        return hotel.getPricePerNight() < price;
    }

    //method to retrieve hotel with 5 star
    public List<Hotel> filterHotelBy5star(){
        List<Hotel> filteredHotels = new ArrayList<>();

        for (Hotel hotels : hotelList){
            if (isHotel5star(hotels)){
                filteredHotels.add(hotels);
            }
        }
        return filteredHotels;
    }

    private boolean isHotel5star(Hotel hotels) {
        return hotels.getHotelTpe() == HotelType.FIVE_STAR;
    }
}
