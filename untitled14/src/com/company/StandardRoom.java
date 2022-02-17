
package com.company;
public class StandardRoom extends room {
    private int numofbeds;
    private double bedprices;
    public void setNumofbeds(int numofbeds) {
        this.numofbeds = numofbeds;
    }
    StandardRoom(int Room_num, int numofbeds, double bedprices)
    {
        this.bedprices=bedprices;
        setRoom_num(Room_num);
        this.numofbeds=numofbeds;
    }
    public double getBedprices() {
        return bedprices;
    }
    public int getNumofbeds() {
        return numofbeds;
    }
    double getBedPrice()

    {
        return bedprices;
    }

    public void setBedprices(double bedprices) {
        this.bedprices = bedprices;
    }

    @Override
    double gettotal(){
        return  getNumofbeds()* getBedprices()*getDays_of_reservation();
    }
    @Override
    public String toString() {
        String s="Standard room:  Room number :"  + getRoom_num() + " numofbeds: " +getNumofbeds()+ " bedprices: " + getBedprices();
        return s ;
    }

}


