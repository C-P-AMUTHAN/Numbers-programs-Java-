import java.util.*;
public class PerfectNumber {
    public static void perfect(int n){
        int sum=0;
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        perfect(x);
    }
}
