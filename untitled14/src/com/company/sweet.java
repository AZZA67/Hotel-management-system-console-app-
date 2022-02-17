
package com.company;

public class sweet extends room {


    private double pricepernight;
    public void setPricepernight(double pricepernight) {
        this.pricepernight = pricepernight;
    }

    sweet(int Room_num , double pricepernight)
    {
        setRoom_num(Room_num);
        setPricepernight(pricepernight);
    }
    double getPriceNight()
    {
        return pricepernight;
    }

    @Override
    double gettotal(){
        return getPriceNight()*getDays_of_reservation();
    }
    @Override
    public String toString() {
        String z="Sweet room : Room number :"+ getRoom_num()+ " pricepernight: " +getPriceNight();
        return z;
    }

}
