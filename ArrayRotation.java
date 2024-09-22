import java.util.*;
public class ArrayRotation {
    public static void rotation(int n, int a[], int k){
        for(int i=0; i<k; i++){
            int last=a[n-1];
            for(int j=n-1; j>0; j--){
                a[j]=a[j-1];
            }
            a[0]=last;
        }
        for(int j=0; j<n; j++){
            System.out.print(a[j]+" ");
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[n];
        for(int k=0; k<n; k++){
            arr[k]=sc.nextInt();
        }
        rotation(n, arr, b);
    }
}
