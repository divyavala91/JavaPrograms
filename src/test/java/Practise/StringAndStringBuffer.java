package Practise;

import java.sql.SQLOutput;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        String s = new String("divya");
        s.concat("chanakya");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("divya");
        sb.append("chanakya");
        System.out.println(sb);

        String s1 = new String("divya");
        String s2 = new String("divya");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        StringBuffer sb1 = new StringBuffer("divya");
        StringBuffer sb2 = new StringBuffer("divya");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));

        String s3 = new String("durga");
        //two objects are created
        //heap , SCP maintained by JVM- two objects for reusability
        String s4 = "durga";

    }
}
