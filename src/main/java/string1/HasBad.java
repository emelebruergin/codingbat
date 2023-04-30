package string1;

public class HasBad {
    /*
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.


        hasBad("badxx") → true
        hasBad("xbadxx") → true
        hasBad("xxbadxx") → false
     */

    public static void main(String[] args) {
        long t1=System.nanoTime();
        String str="badxx";

        System.out.println(hasBad(str));
        long t2=System.nanoTime();

        System.out.println(t2-t1);
    }
    public static boolean hasBad(String str) {

        if(str.startsWith("bad",1)|| str.startsWith("bad",0)){
            return true;
        }
        return false;
    }



}
