/*Anagram example: string1- eat, string2- ate
Both strings have common letters and in equal occurences*/
import java.util.*;
public class Anagram {
    public static void anagram(String s1, String s2){
        int n=s1.length();
        int hash[]=new int[26];
        for(int i=0; i<n; i++){
            hash[s1.charAt(i)-97]++;
        }
        for(int i=0; i<n; i++){
            hash[s2.charAt(i)-97]--;
        }
        int c=0;
        for(int j=0; j<26; j++){
            if(hash[j]!=0){
                c=1;
                System.out.println("Not Anagram");
                break;
            }
        }
        if(c==0)
        System.out.println("Anagram");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String x1=sc.nextLine();
        anagram(x, x1);
    }
}
