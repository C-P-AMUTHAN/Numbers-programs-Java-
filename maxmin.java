import java.util.*;
import java.lang.*;
import java.io.*;
public class maxmin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int max=0, min=0;
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
            if(a[i]>max){
                max = a[i];
            }
        }
        min = max;
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("the maximum number is: "+max);
        System.out.println("the minimum number is: "+min);

    }
}
