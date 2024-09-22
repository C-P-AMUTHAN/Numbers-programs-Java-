class Arraysumaverage{
    public static void main(String args[]){
        int a[] = {10,20,30,40,50};
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        float sum=0,avg;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }    
        System.out.println("sum"+sum);    
        avg = sum/a.length;
        System.out.println("avg"+avg);
    }
}
    

