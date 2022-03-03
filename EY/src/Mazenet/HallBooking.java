package Mazenet;
import java.io.*;
import java.util.*;
class HallBooking implements Runnable {
    
    private String hallName;
    private double cost;
    private int hallCapacity;
    private int seatsBooked;
    
    
    
    HallBooking(){
        
    }
    HallBooking(String hallName,double cost,int hallcapacity,int seatsBooked){
        this.hallName = hallName;
        this.cost = cost;
        this.hallCapacity = hallcapacity;
        this.seatsBooked = seatsBooked;
    }
    
    
    @Override
    public void run(){
        
        
        if((seatsBooked*100)> cost){
            System.out.println("Profit");
            
        }
        else{
            System.out.println("Loss");
        }
    }
    
}

class StatusCheck{
    //public static int count=0;
    static int n = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        //Scanner sc =new Scanner(System.in);
        for(int i=0;i<n;i++){
            //Scanner sc = new Scanner(System.in);
            //sc.nextLine();
            String hall = sc.nextLine();
            String cost =sc.nextLine();
            String capa = sc.nextLine();
            String boo = sc.nextLine();
            //String extra = sc.nextLine();
            //System.out.println(boo);//hall+"/"+cost+"/"+capa+"/"+boo+"/"+"End");
            double cost1 = Double.parseDouble(cost);
            int hallcap = Integer.parseInt(capa);
            int seat = Integer.parseInt(boo);
            //System.out.println(cost1+hallcap+seat);
            HallBooking h1 = new HallBooking(hall,cost1,hallcap,seat);
            Thread t1 = new Thread(h1);
            t1.start();
        }
    }
}