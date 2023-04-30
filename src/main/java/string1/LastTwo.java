package string1;

public class LastTwo {
    /*

        Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


        lastTwo("coding") → "codign"
        lastTwo("cat") → "cta"
        lastTwo("ab") → "ba"
     */
    public static void main(String[] args) {
        String s="codign";
        System.out.println(lastTwo(s));
    }
    public static String lastTwo(String s) {
        if (s.length() < 2) {
            return s;
        } else {
            String lastTwoChars = s.substring(s.length() - 2);
            String restOfString = s.substring(0, s.length() - 2);
            return restOfString + lastTwoChars.charAt(1) + lastTwoChars.charAt(0);
        }
    }


}
