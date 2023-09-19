package mypack;

import java.util.*;

public class Address {
    static Scanner sc = new Scanner(System.in);
    private String homeNo, street, district, city;

    public Address(String homeNo, String street, String district, String city) {
        this.homeNo = homeNo;
        this.street = street;
        this.district = district;
        this.city = city;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress(){
        return homeNo + "-" + street + "-" + district + "-" + city;
    }

    @Override
    public String toString() {
        return this.getAddress();
    }

    

}