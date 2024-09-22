import java.util.*;
public class RailwayTimeConversion {
    public static void conversion(String s){
        StringBuilder s1=new StringBuilder(s);
        int x=s1.length()-1;
        if(s1.charAt(x-1)=='A'){
            if(s1.charAt(0)==49 && s1.charAt(1)==50){
                s1.setCharAt(0, (char)48);
                s1.setCharAt(1, (char)48);
            }
        }
        if(s1.charAt(x-1)=='P'){
            if(s1.charAt(0)==48||s.charAt(0)==49 && (s1.charAt(1)>=48 || s1.charAt(1)<=57)){
                int t=(int)s1.charAt(0)-48;
                int t1=(int)s1.charAt(1)-48;
                t=(t*10)+t1;
                t=t+12;
                int z=(t/10)+48;
                int y=(t%10)+48;
                char d1=(char)z;
                char d2=(char)y;
                s1.setCharAt(0,d1);
                s1.setCharAt(1,d2);
            }
        }
        System.out.print(s1.substring(0,x-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String v1=sc.nextLine();
        conversion(v1);
    }
}
