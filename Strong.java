import java.util.*;
public class Strong {
    public static int factorial(int a){
        int fact=1;
        for(int i=1; i<=a; i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void strong(int n){
        int temp=n, rev=0;
        while(n!=0){
            int rem=n%10;
            rev+=factorial(rem);
            n=n/10;
        }
        if(temp==rev){
            System.out.println("Strong");
        }
        else{
            System.out.println("Not Strong");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        strong(x);
    }
}
