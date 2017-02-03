package com.eval;

/**
 * Created by swapanpreetkaur on 2/1/17.
 */
public class Address {
    String city;
    String street;

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public static Address addressobj(String street, String city){
        Address addr = new Address();
        addr.setCity(city);
        addr.setStreet(street);
        return addr;
    }

}
