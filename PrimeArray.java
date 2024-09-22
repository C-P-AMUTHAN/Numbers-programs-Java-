import java.util.*;
public class PrimeArray {
    public static int prime(int n){
        int c=0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                c=1;
                break;
            }
        }
        if(c==0&& n>1)
        return 1;
        else
        return 0;
    }
    public static void array(int x, int a[]){
        for(int i=0; i<x; i++){
            if(prime(a[i])==0)
            System.out.print(a[i]+" ");
        }
        for(int i=0; i<x; i++){
            if(prime(a[i])==1)
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        array(n, a);
    }
}
