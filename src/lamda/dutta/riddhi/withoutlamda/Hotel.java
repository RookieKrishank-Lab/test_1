package lamda.dutta.riddhi.withoutlamda;

import lamda.dutta.riddhi.withoutlamda.HotelType;

public class Hotel {
    public int pricePerNight;
    public int rating;
    public HotelType hotelType;

    public Hotel(int pricePerNight, int rating, HotelType hotelType) {
        this.pricePerNight = pricePerNight;
        this.rating = rating;
        this.hotelType = hotelType;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public HotelType getHotelTpe() {
        return hotelType;
    }

    public void setHotelTpe(HotelType hotelType) {
        this.hotelType = hotelType;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "pricePerNight=" + pricePerNight +
                ", rating=" + rating +
                ", hotelTpe=" + hotelType +
                '}';
    }
}
