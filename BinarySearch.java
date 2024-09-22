import java.util.*;
public class BinarySearch {
    public static int search(int n, int a[], int k){
        int l=0, r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==k){
                System.out.print("found");
                return 0;
            }
            else if(k<a[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.print("not found");
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        int k=sc.nextInt();
        search(n, a, k);
    }
}
