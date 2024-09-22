import java.util.*;
public class arraycommonprime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of.elements in array: ");
        int n = sc.nextInt();  // number of elements in array
        int[] a = new int[n];

        //getting array values and finding minimum of array using forloop 
        int max=0, min=0;
        System.out.print("Enter array values: ");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
            if(a[i]>max){
                max = a[i];//finding maximum value in array
            }
        }
        min = max;
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];//finding minimum value in array
            }
        }

        // finding prime numbers upto 1000 and storing it in an array named prime
        int[] prime = new int[1000];
        int primecount = 0;
        for(int i=1; i<=1000; i++){
            int factors =0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    factors++;
                }
            }
            if(factors == 2){
                prime[primecount]=i;
                primecount++;
            }
        }

        /*finding whether the primenumber is divisible by numbers in array gives remainder which is equal
         to the minimum value*/
        int count=0, temp = 0;
        for(int i=0; i<primecount; i++){
            count=0;
            temp =0;
            for(int j=0; j<a.length; j++){
                if(a[j]!=min){
                    if(prime[i]>a[j]){
                        if(prime[i]%a[j]==min){
                            count++;
                            temp = count;
                        }
                    }
                }
            }
            if(count == (a.length)-1){
                System.out.println("prime number: "+prime[i]);
                break;
            }
        }
        // if such primenumber could not found, print none
        if(temp != (a.length)-1){
            System.out.println("None"); 
        }
        
    }
}
