package lamda.riddhidutta.WithoutLamda;

public class FilterFiveStarHotel implements HotelFilteringCondition{
    @Override
    public boolean test(Hotel hotel) {
        return hotel.getHotelTpe() == HotelType.FIVE_STAR;
    }
}
