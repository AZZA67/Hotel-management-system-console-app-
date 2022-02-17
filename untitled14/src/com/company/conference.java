package com.company;
public class conference extends room {
    private int numofseats;
    private double seatprice;
    conference(int Room_num,int numofseats,double seatprice)
    {
        setRoom_num( Room_num);
        this.numofseats=numofseats;
        this.seatprice=seatprice;
    }
    int getNumofSeats()
    {
        return numofseats;
    }
    double getSeatPrice()
    {
        return seatprice;
    }
    @Override
    double gettotal()
    {
        return getDays_of_reservation()* getNumofSeats() *getSeatPrice() ;
    }
    @Override
    public String toString()
    {
        String n="Conference room:  Room number :" + getRoom_num() +  " numberofseats: " + getNumofSeats() + " seatprice: " + getSeatPrice();
        return n;
    }


}

