import java.io.*;
import java.util.*;
public class distanceconv {
   // emptyconstructor
    distanceconv(){
       
    }

    //method to convert meter, miles to kilometer
    public static void toKm(double meter, double miles){
        double kmme, kmmi;
        kmme = meter/1000;
        kmmi = miles*1.61;
        System.out.println(meter+" meter is equivalent to "+kmme+" kilometer");
        System.out.println(miles+" miles is equivalent to "+kmmi+" kilometer");
    }

    //method to convert kilometer to meter,miles
    public static void kmTo(double km){
        double m1 = km*1000;
        double m2 = km/1.61;
        System.out.println(km+" kilometer is equivalent to "+m1+" meter");
        System.out.println(km+" kilometer is equivalent to "+String.format("%.2f",m2)+" miles");
    }
    
    //main class
    public static void main(String[] args){
        //object and variable declaration
        Scanner sc = new Scanner(System.in);
        double meter1, mile1, km1;
        
        //conversion method 1
        System.out.println("Distance conversion meter,miles to kilometer");
        System.out.print("enter meter: ");
        meter1 = sc.nextDouble();
        System.out.print("enter miles: ");
        mile1 = sc.nextDouble();
        toKm(meter1, mile1);

        System.out.println("----------------------");

        //conversion method 2
        System.out.println("Distance conversion kilometer to meter,miles");
        System.out.print("enter kilometer: ");
        km1 = sc.nextDouble();  
        kmTo(km1);       
    }

    
}
