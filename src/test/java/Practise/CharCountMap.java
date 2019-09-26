package Practise;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharCountMap {
    public static HashMap getCharCount(String input){
        char[] strArray= input.toCharArray();
        HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();
        for(char c: strArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }

        int maxvalue = Collections.max(charCountMap.values());

        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue()==maxvalue){
                System.out.println(entry.getKey());
            }
        }

        return charCountMap;
    }

    public static void main(String[] args) {
        System.out.println(getCharCount("AAABBCCDDE"));
    }
}
