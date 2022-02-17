
package com.company;
import java.util.Scanner;
import java.io.*;
public class hotel {
    public int numberOfFloor;
    public int numerofrooms;
    floor[] f;
    hotel(String s) {
        File f1 = new File(s);
        String q = null;
        try {
            Scanner d = new Scanner(f1);
            while (d.hasNextLine()) {
                q = d.nextLine();
                String [] a = q.split("[,:.]");
                for (int i = 0; i < a.length; i++) {
                    if (a[i].equals("#floors")) {

                        numberOfFloor = Integer.parseInt(a[i + 1].trim());
                        f = new floor[numberOfFloor];
                        for (int j = 0; j < numberOfFloor; j++) {
                            f[j] = new floor();
                            String h;
                            h = d.nextLine();
                            String[] A = h.split("[,:.]");
                            f[j].setNumofrooms(Integer.parseInt(A[2].trim()));
                            for (int l = 0; l <f[j].getNumofrooms(); l++) {
                                String H;
                                H = d.nextLine();
                                String[]B = H.split("[,.]");
                                if (B[i].equals("Standard")) {

                                    int u = Integer.parseInt(B[i + 1].trim());
                                    int c = Integer.parseInt(B[i + 2].trim());
                                    double o = Double.parseDouble(B[i + 3].trim());
                                    f[j].arr.add(new StandardRoom(u, c, o));
                                } else if (B[i].equals("Sweet")) {

                                    int D = Integer.parseInt(B[i + 1].trim());
                                    double C = Double.parseDouble(B[i + 2].trim());
                                    f[j].arr.add(new sweet(D, C));
                                } else if (B[i].equals("Conference")) {

                                    int M = Integer.parseInt(B[i + 1].trim());
                                    int L = Integer.parseInt(B[i + 2].trim());
                                    int P = Integer.parseInt(B[i + 3].trim());
                                    f[j].arr.add(new conference(M, L, P));
                                }
                            }
                        }
                    }
                }

            }
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex);

        }
    }

    Scanner s = new Scanner(System.in);

    public void display_menu()  {
        int b;
        int U;
        double sum = 0;
        do {
            System.out.println("To show the hotel status please enter 1 :");
            System.out.println("To make reservation please enter 2 :");
            System.out.println("To cancel reservation please enter 3 :");
            System.out.println("to display the price of the stay pleaze enter 4:");
            System.out.println("to display the available room in a particular floor, pleaze enter  5:");
            System.out.println("to display the total expected profits based on the current status of the hotel , pleaze enter 6:");
            System.out.println("to exit enter 0");
            System.out.println("---------------------------------------------");
            b = s.nextInt();
            switch (b)
            {
                case 0:
                    System.out.println("exit");
                    break;
                case 1:

                    for (floor f1 : f)
                    {

                        for (int l = 0; l < f1.arr.size(); l++)
                        {

                            System.out.println(f1.arr.get(l).toString());
                        }
                    }
                    break;
                case 2:
                    System.out.println(" please enter the room number ");
                    int e = s.nextInt();
                    System.out.println(" please enter the days of reservation ");
                    U = s.nextInt();
                    for (floor f1 : f)
                    {

                        for (int l = 0; l < f1.arr.size(); l++)
                        {

                            if (e == f1.arr.get(l).getRoom_num())
                            {

                                f1.arr.get(l).isreserve();

                                if (U > 0)
                                {
                                    f1.arr.get(l).setDays_of_reservation(U);

                                }
                                else
                                {

                                    System.out.println(" please enter valid number of days of reservation");

                                }
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println(" please enter the room number that you want to cancel");
                    int R = s.nextInt();
                    for (floor f1 : f)
                    {
                        for (int l = 0; l < f1.arr.size(); l++)
                        {
                            if (R == f1.arr.get(l).getRoom_num())
                            {
                                f1.arr.get(l).cancel(R);
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println(" please enter the room number that you want to check out");
                    int Q = s.nextInt();
                    for (floor f1 : f)
                    {
                        for (int l = 0; l < f1.arr.size(); l++)
                        {
                            if (Q == f1.arr.get(l).getRoom_num())
                            {
                                System.out.println(f1.arr.get(l).gettotal());
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println(" please enter the number of particular floor you want to check");
                    int w = s.nextInt();
                    try {
                        for (int j = w - 1; j < w; j++)
                        {
                            for (int l = 0; l <f[j].arr.size(); l++)
                            {
                                if (f[w-1].arr.get(l).isreserve() == false) {
                                    {
                                        System.out.println(f[w-1].arr.get(l).toString());
                                    }
                                }

                            }
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException q)
                    {
                    } catch (NegativeArraySizeException V)
                    {
                        System.out.println("please enter a positive number");
                    }
                    break;
                case 6:
                    sum=0;

                    for (floor f1 : f)

                    {
                        for (int l = 0; l < f1.arr.size(); l++)

                        {
                            {
                                sum += f1.arr.get(l).gettotal();
                            }
                        }
                    }
                    System.out.println(sum);
                    break;
                default:
                    System.out.println("please enter number between 0:6");
                    break;
            }
        }
        while (b != 0);
    }
}

