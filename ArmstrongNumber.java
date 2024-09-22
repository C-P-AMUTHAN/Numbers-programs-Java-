import java.util.*;
public class ArmstrongNumber{
    public static int count(int n){
        int c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        return c;
    }
    public static void Armstrong(int a){
        int co=count(a);
        int rev=0, temp=a;
        while(a!=0){
            int rem=a%10;
            rev+=Math.pow(rem,co);
            a=a/10;
        }
        if(temp==rev){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Armstrong(x);
    }
}