import java.util.*;
public class ReverseArray{
    public static void reverse(int n, int a[]){
        int temp=0;
        for(int i=0; i<n/2; i++){
            temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int j=0; j<n; j++){
            a[j]=sc.nextInt();
        }
        reverse(n, a);
    }
}