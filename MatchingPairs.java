import java.util.*;
public class MatchingPairs {
    public static void pair(int n, int a[]){
        int max=a[0], min=a[0],count=0;
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
        for(int k=min; k<max+1; k++){
            if(b[k]>1){
                count+=b[k]/2;
            }
        }
        System.out.print(count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        pair(n, a);
    }
}
