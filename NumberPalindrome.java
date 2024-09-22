import java.util.*;
public class NumberPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp1=n;
        int reverse=0;
        while(n!=0){
            int temp=n%10;
            reverse=(reverse*10)+temp;
            n/=10;
        }
        if(temp1==reverse){
            System.out.println(temp1+" is Palindrome");
        }
        else{
            System.out.println(temp1+" is not Palindrome");
        }
    }
}

