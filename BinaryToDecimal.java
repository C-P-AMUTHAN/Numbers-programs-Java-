import java.util.*;
public class BinaryToDecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int dec=0;
        int i=0;
        while(n!=0){
            int temp=n%10;
            dec = dec+(temp*(int)Math.pow(2,i)); // math function only returns double value, so we have to typecast it to integer.
            i++;
            n/=10;
        }
        System.out.print(dec);
    }
}
