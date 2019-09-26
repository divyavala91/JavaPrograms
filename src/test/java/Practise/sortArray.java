package Practise;

import java.util.*;

public class sortArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,1,3};
        Set<Object> set = new TreeSet<>();
        for(Object b:a){
               set.add(b);
        }
        /*ArrayList al = new ArrayList<>(Arrays.asList(a));
        Collections.sort(al);
        *//*Collections.reverse(al);*/
        for (Object i:set) {
            System.out.println(i);
        }



    }
}
