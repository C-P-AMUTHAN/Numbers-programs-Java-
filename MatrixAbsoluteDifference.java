import java.util.*;
import java.io.*;
public class MatrixAbsoluteDifference{
    public static void difference(int r, int c, int m[][]){
        int d1=0,d2=0;
        for(int i=0; i<r; i++){
            d1+=m[i][i];
            d2+=m[i][r-i-1];
        }
        System.out.println(Math.abs(d1-d2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int m[][]=new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                m[i][j]=sc.nextInt();
            }
        }
        difference(r, c, m);
    }
}

























