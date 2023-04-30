package string1;

public class ConCat {
    /*
        Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


        conCat("abc", "cat") → "abcat"
        conCat("dog", "cat") → "dogcat"
        conCat("abc", "") → "abc"
     */
    public static void main(String[] args) {
        String a="abc";
        String b="cat";
        System.out.println(conCat(a, b));

    }
    public static String conCat(String a, String b) {
        if(a.length()!=0 && b.length()!=0&&a.substring(a.length()-1).equals(b.substring(0,1))){
            return a+b.substring(1);
        }else {

            return a+b;
        }
    }
}
