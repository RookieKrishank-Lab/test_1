package lamda.riddhidutta.WithoutLamda;

public class FilterHotelLessThan20000 implements HotelFilteringCondition {
    @Override
    public boolean test(Hotel hotel) {
        return hotel.getPricePerNight() <20000;
    }
}
