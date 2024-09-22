import java.lang.Math;
import java.util.*;
class root{
    double i;
    double X(){
        return Math.sqrt(i);
    }
}
class Squareroot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        root s = new root();
        s.i = sc.nextInt();
        System.out.println("the square root of"+ s.i +"is"+ s.X());
    }
}
