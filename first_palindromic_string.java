import java.util.ArrayList;
import java.util.Arrays;

public class Debugger {
    public static void main(String[] args) {
       String[] words = {"notapalindrome","racecar"};
//        Output:"ada"
        System.out.println(first_palindrome(words));
    }
    static String first_palindrome(String[] words){
        boolean ans=false;
        for(int i=0;i< words.length;i++){
            if(is_palindrome(words[i])){
                ans=true;
                return words[i];
            }
        }
        return null;
    }
    static  boolean is_palindrome(String s){
        int i=0;
        int j=s.length()-1;
        boolean ans=true;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                ans=true;
            }
            else{
                ans=false;
                break;
            }
            i++;
            j--;
        }
       return ans;
    }
}
