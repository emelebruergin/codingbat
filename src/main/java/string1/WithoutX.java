package string1;

public class WithoutX {
    /*
    Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


    withoutX("xHix") → "Hi"
    withoutX("xHi") → "Hi"
    withoutX("Hxix") → "Hxi"
     */

    public static void main(String[] args) {
        String str="Hxix";
        System.out.println(withoutX(str));
    }
    public static String withoutX(String str) {
        if(str.startsWith("x") || str.endsWith("x")){
            if (str.startsWith("x")){
                str= str.substring(1);
            }
            if (str.endsWith("x")){
                return   str.substring(0,str.length()-1);
            }
        }
        return str;
    }


}
