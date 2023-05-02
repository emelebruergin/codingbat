package lambda2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoNeg {
    /*

Given a list of integers, return a list of the integers, omitting any that are less than 0.


noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
     */
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>(Arrays.asList(1,2,3,-4,-22));
        System.out.println(noNeg(nums));
    }
    public static List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(t->t<0);
        return nums;
    }

}
