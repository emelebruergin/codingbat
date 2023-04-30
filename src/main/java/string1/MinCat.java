package string1;

public class MinCat {
    /*

        Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


        minCat("Hello", "Hi") → "loHi"
        minCat("Hello", "java") → "ellojava"
        minCat("java", "Hello") → "javaello"
     */
    public static void main(String[] args) {
        String a="Hello";
        String b="Hi";
        System.out.println(minCat(a, b));
    }
    public static String minCat(String a, String b) {
        if(b.length()<a.length()){
            return a.substring(a.length()-b.length())+b;
        }else{
            return a+b.substring(b.length()-a.length());
        }


    }

}
