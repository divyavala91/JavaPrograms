package Practise;

import java.lang.reflect.Array;
import java.util.HashMap;

public class arrayOfHashMaps {

    public static void main(String[] args) {

    }

    public boolean keyValuehashMap(HashMap<String , String > hm ,String username, String password){
        boolean exists = false;
        for(int i=0;i<hm.size();i++) {
            if (hm.containsKey(username)) {
                if (hm.get(username).equals(password)) {
                    exists = true;
                }
            }
        }
        return exists;
    }
}
