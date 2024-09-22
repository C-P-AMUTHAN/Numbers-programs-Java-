import java.util.*;
public class AlternateSorting{
    public static void sort(int n, int a[]){
        int temp=0;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int k=0; k<n/2; k++){
            int x=a[n-k-1];
            System.out.print(x+" ");
            int y=a[k];
            System.out.print(y+" ");
        }
        if(n%2!=0){
            System.out.print(a[n/2]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        sort(n, a);
    }
}