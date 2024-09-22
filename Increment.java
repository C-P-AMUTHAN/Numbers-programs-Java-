import java.util.*;
public class Increment{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];

        // post increment
        for(int i=0; i<n; i++){
            a1[i]=i++;
        }
        // Arrays toString method convert the array into string and printing it
        System.out.println(Arrays.toString(a1));

        // pre increment
        for(int i=0; i<n; ++i){
            a2[i]=++i;
        }
        // Arrays toString method convert the array into string and printing it
        System.out.println(Arrays.toString(a2));
    }
}