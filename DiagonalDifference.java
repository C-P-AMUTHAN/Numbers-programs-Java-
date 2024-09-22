import java.util.*;
public class DiagonalDifference {
    public static int diagonalDifference(int n,int[][] arr) {
        int major = 0;
        int minor = 0;
        int c = n-1;
        for(int i=0; i<n; i++){
            major += arr[i][i];
            minor += arr[i][c];
            c--;
        }
        int ans = Math.abs(major - minor);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        System.err.print("enter matrix: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] =  sc.nextInt();
            }
        }
        int ans = diagonalDifference(n,a);
        System.out.print(ans);
    }
}
