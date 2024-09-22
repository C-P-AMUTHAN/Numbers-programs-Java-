import java.util.Scanner;
class vote{
    boolean eligibility(int age){
        if(age>=18){
            return true;
        }
        else if(age<18){
            return false;
        }
        else{
            return false;
        }
    }
}
public class voting {
    public static void main(String[] args){
        vote a = new vote();
        Scanner sc = new Scanner(System.in);
        int ag = sc.nextInt();
        System.out.println("voting: "+a.eligibility(ag));
    }
}
