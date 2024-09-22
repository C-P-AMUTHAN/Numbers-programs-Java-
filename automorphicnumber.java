//Automorphic number example: 25^2 = 625 , 76^2 = 5776
import java.util.*;
public class automorphicnumber{
    public static void automorphic(int n){
        int square = n*n;
        int count = 0;
        while(n!=0){
            if((n%10)!=(square%10)){
                count=1;
                break;
            }
            n = n/10;
            square = square/10;
        }
        if(count==0){
            System.out.println("automorphic number");
        }
        else{
            System.out.println("not an automorphic number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        automorphic(num);
    }
}
