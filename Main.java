/*
Restaurant---
There is 1 counter, the person at the counter takes the order and passes back to the kitchen(chef).
chef prepares the order and comes to the ready order shelves.
order is served/delivered to the customer by waiter
*/
import jdk.internal.dynalink.beans.StaticClass;

public class Main {
    static String [][]name=new String[3][2];
    static int i=0;
    static void setName(){
       name[0][0]="sushmitha";
       name[1][0]="niru";
       name[2][0]="pavan";
       name[0][1]="pizza";
       name[1][1]="burger";
       name[2][1]="Noodles";
    }
    static int orderId(){
        i=i+1;
        return i;
    }

    public static void main(String []args){
        System.out.println("Restaurant opened!!!");
        //creating runnable object to each class
        Runnable obj1=new counter();
        Runnable obj2=new chef();
        Runnable obj3=new waiter();

        //assigning threads to each object
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        Thread t3=new Thread(obj3);

        //making the threads to start executing
        t1.start();
        t2.start();
        t3.start();

        //joining the threads so that it checks whether all the threads completed executing or not
        try {
            t1.join();
            t2.join();
            t3.join();
        }
        catch(Exception e){}
        System.out.println("Restaurant closed!!!");


    }



}
