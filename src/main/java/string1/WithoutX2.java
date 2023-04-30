package string1;

public class WithoutX2 {
    /*

        Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


        withoutX2("xHi") → "Hi"
        withoutX2("Hxi") → "Hi"
        withoutX2("Hi") → "Hi"
     */
    public static void main(String[] args) {
        String str="Hxi";
        System.out.println(withoutX2(str));
    }
    public static String withoutX2(String str) {
        if (str.length()<2){
            return "";
        }
        else if(str.substring(0,2).contains("x")){
            return  str.substring(0,2).replace("x","")+str.substring(2);
        }
        else {
            return str;
        }
    }

}
