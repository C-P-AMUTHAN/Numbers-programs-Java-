import java.io.*;
import java.util.*;
public class timeconv {

    //method to convert minutes,seconds to hours
    public static void toHo(double m, double s){
        double hm, hs;
        hm = m/60;
        hs = s/360;
        System.out.println(m+" minutes is equal to "+hm+" hours");
        System.out.println(s+" seconds is equal to "+hs+" hours");
    }

    //method to convert hours to minutes,seconds
    public static void hoTo(double h){
        double mh, sh;
        mh = h*60;
        sh = h*360;
        System.out.println(h+" hours is equal to "+mh+" minutes");
        System.out.println(h+" hours is equal to "+sh+" seconds");
    }

    //main class
    public static void main(String[] args){
        //object and variable declaration
        Scanner sc = new Scanner(System.in);
        double hours, minutes, seconds;
        
        //convert method 1
        System.out.println("minutes,seconds to hours conversion");
        System.out.print("enter minutes: ");
        minutes = sc.nextDouble();
        System.out.print("enter seconds: ");
        seconds = sc.nextDouble();
        toHo(minutes, seconds);

        System.out.println("-----------------------");

        //convert method 2
        System.out.println("hours to minutes,seconds conversion");
        System.out.print("enter hours: ");
        hours = sc.nextDouble();
        hoTo(hours);
    }
}
