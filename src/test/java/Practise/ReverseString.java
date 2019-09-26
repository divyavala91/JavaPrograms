package Practise;

import java.util.ArrayList;

public class ReverseString {
    public static void main(String[] args) {
        String s = "madam is angry";
        String[] strA = s.split(" ");
        String r = "";
        for(int i=0;i<strA.length;i++){
            r = r + reverseString(strA[i]) + " ";

        }
        System.out.printf("r:"+r);

    }

    public static String reverseString(String input){
        String r ="";
        for(int i=input.length()-1; i>=0 ;i--){
            r = r+input.charAt(i);
        }
        return r;
    }
}
