import java.util.Scanner;
public class NonRepeatedIntegers {
    public static void repeat(int a, int b){
        int count=0,c=0;
        int n[]=new int[100];
        while(a<=b){
            int temp=a;
            while(temp!=0){
                n[c]=temp%10;
                temp=temp/10;
                c++;            
            }
            a++;
        }
        int max=n[0], min=n[0];
        for(int j=0; j<c; j++){
            if(n[j]>max){
                max=n[j];
            }
            if(n[j]<min){
                min=n[j];
            }
        }
        int N[]=new int[max+1];
        for(int i=0; i<c; i++){
            N[n[i]]++;
        }
        for(int x=min; x<=max; x++){
            if(N[x]==1){
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        repeat(a, b);
    }
}
