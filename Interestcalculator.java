import java.util.*;
public class Interestcalculator {
    public static void main(String args[]){
        float principalamount = 0;
        float rateofinterest = 0;
        int numberofyears = 0;
        Scanner sc= new Scanner(System.in);
        String tempstring;
        System.out.println("enter principal amount");
        System.out.flush();
        tempstring = sc.nextLine();
        principalamount = Float.valueOf(tempstring);
        System.out.println("enter rate of interest");
        System.out.flush();
        tempstring = sc.nextLine();
        rateofinterest = Float.valueOf(tempstring);
        System.out.println("enter number of years");
        System.out.flush();
        tempstring = sc.nextLine();
        numberofyears = Integer.parseInt(tempstring);
        float totalinterest = principalamount * rateofinterest * numberofyears;
        System.out.println("the total interest "+totalinterest);
    }
    
}
