package lambda1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    /*
    Given a list of strings, return a list where each string has "y" added at its start and end.


moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]
     */
    public static void main(String[] args) {
        List<String >strings=new ArrayList<>(Arrays.asList("a","b","c"));
        System.out.println(moreY(strings));
    }
    public static List<String> moreY(List<String> strings) {
        return strings.stream().map(t->"y"+t+"y").collect(Collectors.toList());
    }

}
