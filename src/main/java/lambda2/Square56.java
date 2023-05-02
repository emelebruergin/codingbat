package lambda2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
    /*

Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.


square56([3, 1, 4]) → [19, 11]
square56([1]) → [11]
square56([2]) → [14]
     */
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>(Arrays.asList(3,1,4));
        System.out.println(square56(nums));

    }
    public static List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(t->(t*t)+10).filter(t->t%10!=5 && t%10!=6).collect(Collectors.toList());
    }

}
