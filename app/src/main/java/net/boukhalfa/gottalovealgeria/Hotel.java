package net.boukhalfa.gottalovealgeria;

/**
 * Created by Hamza on 22/07/2016.
 */
public class Hotel {

    public int icon;
    public String HotelTitle;
    public String HotelPhone;
    public String HotelAdress;

    public Hotel(){
        super();
    }

    public Hotel(int icon, String hotelTitle, String hotelPhone, String hotelAdress) {
        this.icon = icon;
        HotelTitle = hotelTitle;
        HotelPhone = hotelPhone;
        HotelAdress = hotelAdress;
    }
    public void AddNewHotel(int icon, String hotelTitle, String hotelPhone, String hotelAdress) {
        this.icon = icon;
        HotelTitle = hotelTitle;
        HotelPhone = hotelPhone;
        HotelAdress = hotelAdress;
    }

    public String getHotelPhone() {
        return HotelPhone;
    }
}
