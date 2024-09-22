import java.util.*;
import java.lang.*;
public class KGreatestElement{
    public static void greatest(int n, int a[], int k){
        int max=a[0], min=a[0], count=k;
        for(int i=0; i<n; i++){
            if(a[i]>max)
            max=a[i];
            else if(a[i]<min)
            min=a[i];
        }
        int b[]=new int[max+1];
        for(int x=0; x<n;x++){
            b[a[x]]++;
        }
        for(int i=max; i>=min; i--){
            if(b[i]!=0)
            count--;
            if(count==0){
                System.out.print(i);
                break;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        int k=sc.nextInt();
        greatest(n, a, k);
    }
}