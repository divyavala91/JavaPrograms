package Practise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class orderTheStrings {

    public static void main(String[] args) {
        String input = "the sentence is arranged in order";
        String[] inputSplit = input.split(" ");
        String[] stringSortedOnLength = arrangeWordsBasedOnLength(inputSplit);
        String[] reversedStrings = reverseTheStringWithDiffLength(stringSortedOnLength);
        for(String s:stringSortedOnLength){
            System.out.println(s);
        }

        for(String s:reversedStrings){
            System.out.println(s);
        }

    }

    private static String[] reverseTheStringWithDiffLength(String[] input) {
        for(int i=0;i<(input.length-1);i++){
            System.out.println("stringSortedOnLength[i+1].length():"+input[i+1].length());
            System.out.println("stringSortedOnLength[i].length():"+input[i].length());
            if(input[i+1].length() > input[i].length()){
                System.out.println("stringSortedOnLength[i+1]:"+input[i+1]);
                input[i+1]=reverseTheString(input[i+1]);
                System.out.println("stringSortedOnLength[i+1]:"+input[i+1]);
            }
        }
        return input;
    }

    private static String reverseTheString(String s) {
        String result = "";
        for(int i = (s.length()-1);i>=0;i--){
            result = result + s.charAt(i) ;
        }
        return result;
    }

    private static String[] arrangeWordsBasedOnLength(String[] input) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) return o1.compareToIgnoreCase(o2);
                else return o1.length() - o2.length();
            }
        };
        Arrays.sort(input,comparator);
        return input;
    }
}
