import java.util.*;
public class SquareNumber {
    public static void square(int a, int b){
        for(double i=Math.sqrt(a); i<Math.sqrt(b); i++){
            double B=i*i;
            int A = (int)B;
            System.out.print(A+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        square(a, b);
    }
}
