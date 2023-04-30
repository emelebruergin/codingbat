package string1;

public class DeFront {
    /*

        Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


        deFront("Hello") → "llo"
        deFront("java") → "va"
        deFront("away") → "aay"
     */
    public static void main(String[] args) {
        String str="abway";
        System.out.println(deFront(str));

    }
    public static String deFront(String str) {

        String a="";
        if(str.substring(0,1).equals("a")){
            a+=str.substring(0,1);
        }if (str.substring(1,2).equals("b")){
            a+=str.substring(1,2);
        }if(str.length()>2){
            a+=str.substring(2);
        }
        return a;
    }
}
