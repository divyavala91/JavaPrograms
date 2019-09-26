package Practise;


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class RegularExpressions {

    public static void main(String[] args) {
        String alphanumeric = "abcDeeeF12344sdffK99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));
        System.out.println(alphanumeric.replaceAll("^abcDeee","Y"));

        String secondString = "abcDeeeF12344abcDeeesdffK99z";

        System.out.println(secondString.replaceAll("^abcDeee","YYYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.replaceAll("fK99z$","THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]","REPLACE"));
        System.out.println(alphanumeric.replaceAll("[aei][sb]","REPLACE"));
        System.out.println("harry".replaceAll("[Hh]arry","Harry"));
        System.out.println("abceeejhhjg".replaceAll("[^ej]","X"));
        System.out.println("abceeeAFJH34234".replaceAll("[a-f3-8]","X"));
        System.out.println("abceeeAFJH34234".replaceAll("(?i)[a-f3-8]","X"));
        System.out.println("abceeeAFJH34234".replaceAll("\\d","X"));
        System.out.println("abceeeAFJH34234".replaceAll("\\D","X"));
        System.out.println("I have blanks and\ta tab\n".replaceAll("\\s",""));





    }





}
