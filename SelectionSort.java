import java.util.*;
public class SelectionSort{
    public static void sorting(int n, int a[]){
        for(int i=0; i<n; i++){
            int min=a[i],index=i;
            for(int j=i+1; j<n; j++){
                if(a[j]<min){
                    min=a[j];
                    index=j;
                }
            }
            int temp=a[i];
            a[i]=a[index];
            a[index]=temp;
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