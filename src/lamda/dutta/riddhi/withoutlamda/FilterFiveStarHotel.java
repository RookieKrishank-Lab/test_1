package lamda.dutta.riddhi.withoutlamda;

public class FilterFiveStarHotel implements HotelFilteringCondition{
    @Override
    public boolean test(Hotel hotel) {
        return hotel.getHotelTpe() == HotelType.FIVE_STAR;
    }
}
