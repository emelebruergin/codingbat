package map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    /*

Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
     */

    public static void main(String[] args) {
        String [] strings ={"salt","ck", "tea", "soda", "toast"};
        System.out.println(firstChar(strings));

    }
    public static Map<String, String> firstChar(String[] strings) {
       Map<String,String> hs=new HashMap<>();
        for(String w:strings){
            String firstChar=w.substring(0,1);
            if(hs.containsKey(firstChar)){
                hs.put(firstChar,hs.get(firstChar)+w);
            }else{
                hs.put(firstChar,w);
            }
        }return hs;
    }


}
