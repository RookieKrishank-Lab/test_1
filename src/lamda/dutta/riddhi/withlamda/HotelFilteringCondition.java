package lamda.dutta.riddhi.withlamda;

@FunctionalInterface
public interface HotelFilteringCondition {

    boolean test(Hotel hotel);
}
