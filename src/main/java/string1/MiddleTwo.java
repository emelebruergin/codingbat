package string1;

public class MiddleTwo {
    /*
    Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.


        middleTwo("string") → "ri"
        middleTwo("code") → "od"
        middleTwo("Practice") → "ct"
     */
    public static void main(String[] args) {
        String str="Practice";
        System.out.println(middleTwo(str));
    }
    public static String middleTwo(String str) {
        return str.substring(str.length()/2-1,str.length()/2+1);
    }


}
