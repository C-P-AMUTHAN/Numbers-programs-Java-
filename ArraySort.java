import java.util.*;
public class ArraySort {
    public static void sort(int n, int a[]){
        int temp=0;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(a[j]<a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int ar[]=new int[a];
        for(int k=0; k<a; k++)
        ar[k]=sc.nextInt();
        sort(a,ar);
        for(int i=0; i<a; i++){
            System.out.print(ar[i]+" ");
        }
    }
}
