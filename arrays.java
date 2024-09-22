
public class arrays {
    public static void main(String[] args){
        int[] natural = new int[10];
        for(int i=0; i<10; i++){
            natural[i] = i+1;
        }
        int a=2;
        System.out.println("TABLES");
        for(int i=0; i<10; i++){
            System.out.printf("%d * %d = %d\n",a,natural[i],a*natural[i]);
        }

    }
}
