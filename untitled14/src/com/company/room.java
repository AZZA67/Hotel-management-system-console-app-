
package com.company;

public abstract class room {


    private boolean isreserved;
    private int Room_num;
    private int Days_of_reservation;

     void reverse()
     {
         if(isIsreserved()==true)
             System.out.println("please enter other room number because it is reserved");
         else
         setIsreserved(true);
     }
    boolean isreserve() {
        {
            if(isreserved)
            {
                return true;
            }
            else
                return false;
        }
    }
    abstract double gettotal();

    public boolean isIsreserved() {
        return isreserved;
    }

    public void setIsreserved(boolean isreserved) {
        this.isreserved = isreserved;
    }

    public int getDays_of_reservation() {
        return Days_of_reservation;
    }

    public void setDays_of_reservation(int days_of_reservation) {
        Days_of_reservation = days_of_reservation;
    }

    public int getRoom_num() {
        return Room_num;
    }

    public void setRoom_num(int room_num) {
        Room_num = room_num;
    }

    void cancel(int p)
    {
        setIsreserved(false);
        Days_of_reservation=0;
    }
    @Override
    public abstract  String toString();

}
