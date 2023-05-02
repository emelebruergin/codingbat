package lambda1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lower {
    /*

Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).


lower(["Hello", "Hi"]) → ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
     */
    public static void main(String[] args) {
        List <String> strings=new ArrayList<>(Arrays.asList("HelLo","HI"));
        System.out.println(lower(strings));

    }
    public static List<String> lower(List<String> strings) {
        return strings.stream().map(t-> t.toLowerCase()).collect(Collectors.toList());
    }
}
