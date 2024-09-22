import java.util.*;
public class ArrayPrime {
    public static int prime(int n){
        int c=0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                c=1;
                break;
            }
        }
        if(c==0 && n>1){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void Array(int a, int ar[]){
        for(int i=0; i<a; i++){
            if(prime(ar[i])==1){
                System.out.print(ar[i]+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        int ar[]=new int[b];
        for(int i=0; i<b; i++)
        ar[i]=sc.nextInt();
        Array(b, ar);
    }
}
