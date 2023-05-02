package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Math1 {
    /*
    Bir tamsayı listesi verildiğinde, her tamsayının 1'e eklendiği ve sonucun 10 ile çarpıldığı bir liste döndürün.


math1([1, 2, 3]) → [20, 30, 40]
math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
math1([10]) → [110]
     */
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(math1(nums));

    }
    public static List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(t-> (t+1)*10).collect(Collectors.toList());
    }
}
