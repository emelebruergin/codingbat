package string3;

public class EqualsIsNot {
    /*
    Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).


        equalIsNot("This is not") → false
        equalIsNot("This is notnot") → true
        equalIsNot("noisxxnotyynotxisi") → true
     */
    public static void main(String[] args) {
        String str="noisxxnotyynotxisi";
        System.out.println(equalIsNot(str));

    }
    public static boolean equalIsNot(String str) {
        int isCount=0;
        int notCount=0;
        if(str.endsWith("is")){
            isCount++;
        }
        for(int i=0;i<str.length()-2;i++){
            if(str.substring(i,i+2).equals("is")){
                isCount++;
            }
            if(str.substring(i,i+3).equals("not")){
                notCount++;
            }
        }

        if(isCount==notCount){
            return true;
        }
        return false;
    }

}
