import java.util.*;
public class SlidingWindow {
    public static void arrayMax(int n, int a[], int k){
        int temp=k;
        for(int i=0;i<n; i++){
            int max=0;
            for(int j=i; j<temp; j++){
                if(a[j]>max){
                    max=a[j];
                }
            }
            System.out.print(max+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int k=sc.nextInt();
        int ar[]=new int[x];
        for(int i=0; i<x; i++)
        ar[i]=sc.nextInt();
        arrayMax(x, ar,k);
    }
}
