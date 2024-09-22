/*Harshed number example: 156 = 1+5+6=12 since 12 is divisible of 156 */
import java.util.*;
class harshednumber{
    public static void Harshed(int n){
        int sum = 0;
        int temp = n;
        while(n!=0){
            sum = sum+(n%10);
            n = n/10;
        }
        if(temp%sum==0){
            System.out.println("harshed number");
        }
        else{
            System.out.println("not an harshed number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Harshed(N);
    }
}
