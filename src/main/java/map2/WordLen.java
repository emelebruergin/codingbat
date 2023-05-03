package map2;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    /*

Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 and the value is that string's length.


wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
     */
    public static void main(String[] args) {
        String[] strings = {"a","bb","a","bb"};
        System.out.println(wordLen(strings));

    }
    public static Map<String, Integer> wordLen(String[] strings) {
        HashMap <String,Integer> hs=new HashMap<>();
        for(String w:strings){
            hs.put(w,w.length());
        }
        return hs;
    }

}
