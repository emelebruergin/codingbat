package lambda2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoTeen {
    /*

Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.


noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []
     */
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>(Arrays.asList(12,13,19,20));
        System.out.println(noTeen(nums));

    }
    public static List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(t->t>=13 && t<=19);
        return nums;
    }


}
