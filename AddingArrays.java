import java.util.*;
public class AddingArrays{
    public static void add(int a, int A[], int b, int B[]){
        long x=0,y=0;
        for(int i=0; i<a; i++){
            x=(x*10)+A[i];
        }
        for(int j=0; j<b; j++){
            y=(y*10)+B[j];
        }
        long c=x+y;
        System.out.println(c);
        int u=0;
        int z[]=new int[a];
        while(c!=0){
            int temp=(int)c%10;
            z[u]=temp;
            u++;
            c=c/10;
        }
        for(int i=u-1; i>=0; i--){
            System.out.print(z[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int n1=sc.nextInt();
        int b[]=new int[n1];
        for(int j=0; j<n1; j++){
            b[j]=sc.nextInt();
        }
        add(n, a, n1, b);
    }
}
