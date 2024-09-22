import java.util.*;
public class PreviousGreater {
    public static void previous(int n, int a[]){
        int max=a[0];
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(a[j]>max){
                    max=a[j];
                }
            }
            System.out.print(max+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        previous(n, a);
    }
}
