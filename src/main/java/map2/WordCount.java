package map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    /*

The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
 with a key for each different string, with the value the number of times that string appears in the array.


wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
     */
    public static void main(String[] args) {
        String[] strings = {"a","b","d","d","d","c","c"};
        System.out.println(wordCount(strings));

    }
    public static Map<String, Integer> wordCount(String[] strings) {
        HashMap<String,Integer> hs=new HashMap<>();

        for (String w:strings){
            if(hs.containsKey(w)){
                hs.put(w,hs.get(w)+1);
            }else{
                hs.put(w,1);
            }
        }
        return hs;
    }

}
