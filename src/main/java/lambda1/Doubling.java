package lambda1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
    /*
    Given a list of integers, return a list where each integer is multiplied by 2.


        doubling([1, 2, 3]) → [2, 4, 6]
        doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
        doubling([]) → []
     */
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(doubling(nums));
    }
    public static List<Integer> doubling(List<Integer> nums) {
        return   nums.stream().map(t-> t*2).collect(Collectors.toList());

    }

}
