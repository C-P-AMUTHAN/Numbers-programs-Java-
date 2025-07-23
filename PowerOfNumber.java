import java.util.*;
public class PowerOfNumber {
    public static int getPower(int n, int p) {
        if(p == 1) {
            return n;
        }
        return n * getPower(n, p-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(getPower(n,p));
        sc.close();
    }
}