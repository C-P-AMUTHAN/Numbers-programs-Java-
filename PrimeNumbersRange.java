import java.util.*;
public class PrimeNumbersRange {
    public static int prime(int n){
        int factors=0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                factors=1;
                break;
            }
        }
        if(factors==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void primerange(int a){
        for(int j=2; j<=a; j++){
            int flag=prime(j);
            if(flag==1){
                System.out.print(j+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        primerange(x);
    }
}
