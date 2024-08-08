package lamda.riddhidutta.WithLamda;

@FunctionalInterface
public interface HotelFilteringCondition {

    boolean test(Hotel hotel);
}
