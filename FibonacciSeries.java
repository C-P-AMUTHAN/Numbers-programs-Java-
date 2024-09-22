//fibonacci series without using recursion and using recursion
import java.util.*;
import java.io.*;
public class FibonacciSeries{
    int n1=0, n2=1, n3;
    //method to recursion for fibonacci series
    void printFibonacci(int c){
        if(c>0){
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
            printFibonacci(c-1);
        }
    }
    public static void main(String args[]){
        System.out.println("Fibonacci series without recursion");
        int n1=0, n2=1, n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements to be printed: ");
        int c = sc.nextInt();
        
        //using without recursion
        System.out.print(n1+" "+n2+" ");
        for(int i=0; i<c; i++){
            n3 = n1+n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println();

        //using recursion
        System.out.println("Fibonacci series using recurion");
        FibonacciSeries f = new FibonacciSeries();
        n1=0;
        n2=1;
        System.out.print(n1+" "+n2+" ");
        f.printFibonacci(c);
    }
}