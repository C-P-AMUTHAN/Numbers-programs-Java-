import java.util.*;
public class Charity{
    public static int coins(int n){
        int total=0;
        for(int i=1; i<=n; i++){
            total+=i*i;
        }
        return total;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t=coins(x);
        System.out.print(t);
    }
}