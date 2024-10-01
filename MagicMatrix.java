import java.util.*;
public class MagicMatrix {
    public static void matrix(int n, int[][] m) {
        int srow = 0;
        int scol = n/2;
        for(int i=1; i<=n*n; i+=1){
            m[srow][scol] = i;
            srow -=1;
            scol +=1;
            if(srow == -1 && scol<=n-1) {
                srow = n-1;
            }
            else if(scol == n && srow >= 0) {
                scol = 0;
            }
            else if(srow < 0 && scol >= n) {
                srow += 2;
                scol -=1;
            }
            else if(srow >= 0 && scol <=n-1 && m[srow][scol] != 0){
                srow +=2;
                scol -=1;
            }
        }
        System.out.println("Magic Matrix: ");
        for(int[] row: m) {
            for(int value: row){
                System.out.print(value +"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        matrix(n,m);
        sc.close();
    }
}

// Algorithm of Magic matrix = sum of all rows and sum of all columns and sum of all diagonals are equal

// --> start with 0th row and middle column, and place the first number(1) there
// --> Move 1 step up and 1 step right
// -----> if column is available but row is not available, then move to the last row (n-1) of the respective column
// -----> if row is available but column is not available, then move to the first column (0) of the respective row
// -----> if row and column are not available, the return to the previous position and come 1 step down
// -----> if row and column is available but there is a value other than zero, i.e previously filled, then come to previous position and come 1 step down
// --> Assign the value in sequence, from 2 to n*n;