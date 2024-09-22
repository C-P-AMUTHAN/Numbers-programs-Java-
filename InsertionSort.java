import java.util.*;
public class InsertionSort {
    public static void sorting(int n, int a[]){
        for(int i=1; i<n; i++){
            int t=a[i];
            int j=i-1;
            while(j>=0 && a[j]>t){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=t;
        }
        for(int k=0; k<n; k++)
        System.out.print(a[k]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        sorting(n, a);
    }
}
