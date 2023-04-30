package string3;

public class SameEnds {
    /*

        Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".


        sameEnds("abXYab") → "ab"
        sameEnds("xx") → "x"
        sameEnds("xxx") → "x"
     */
    public static void main(String[] args) {
        String string="abXYab";
        System.out.println(sameEnds(string));

    }
    public static String sameEnds(String string) {
        String s="";
        if(string.length()>1){
            for(int i=0;i<=string.length()-1;i++){
                if(i<string.length()/2 && string.substring(0,i+1).equals(string.substring(string.length()-i-1))){
                    s=string.substring(0,i+1);
                }

            } return s;
        } return s;
    }
}


