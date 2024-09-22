import java.util.Scanner;
public class PrimeDivisible {
    public static int prime(int n){
        int c=0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                c=1;  
                break;
            }
        }
        if(c==0 && n>1)
        return 1;
        else
        return 0;
    }
    public static void divisible(int a, int A[], int b, int B[]){
        for(int i=0; i<a; i++){
            for(int c=4; c<=1000; c++){
                if(prime(c)==0){
                    if((A[i]+c)%B[i]==0){
                        System.out.print(c+" ");
                        break;
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        int n1=sc.nextInt();
        int a1[]=new int[n1];
        for(int j=0; j<n1; j++)
        a1[j]=sc.nextInt();
        divisible(n, a, n1, a1);
    }
}
