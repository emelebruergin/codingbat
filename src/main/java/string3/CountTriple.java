package string3;

public class CountTriple {
    /*
        We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.


        countTriple("abcXXXabc") → 1
        countTriple("xxxabyyyycd") → 3
        countTriple("a") → 0
     */
    public static void main(String[] args) {
        String str="xxxabyyyycd";
        System.out.println(countTriple(str));

    }
    public static int countTriple(String str) {
        int count=0;
        for(int i=2;i<str.length();i++){
            if(str.charAt(i-2)==str.charAt(i-1) && str.charAt(i-1)==str.charAt(i)){
                count++;
            }
        }
        return count;
    }

}

