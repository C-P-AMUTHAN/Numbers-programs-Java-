import java.util.*;
public class HalfReverseArray {
    public static void reverse(int n, int a[]){
        int b=n/2, x=0;
        for(int i=b; i<(3*n)/4; i++){
            int temp=a[i];
            a[i]=a[n-x-1];
            a[n-x-1]=temp;
            x++;
        }
        for(int k=0; k<n; k++){
            System.out.print(a[k]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int ar[]=new int[x];
        for(int i=0; i<x; i++){
            ar[i]=sc.nextInt();
        }
        reverse(x, ar);
    }
}
