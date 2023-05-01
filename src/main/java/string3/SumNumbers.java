package string3;

public class SumNumbers {
    /*

        Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)


        sumNumbers("abc123xyz") → 123
        sumNumbers("aa11b33") → 44
        sumNumbers("7 11") → 18
     */
    public static void main(String[] args) {

        String str="aa11bb33";

        System.out.println(sumNumbers(str));
    }
    public static int sumNumbers(String str) {
        String s="0";
        int sum=0;
        for (int i=0;i<str.length() ;i++){
            if(Character.isDigit(str.charAt(i))){
               s+=str.substring(i,i+1);
            }else {
                sum+=Integer.parseInt(s);
               s="0";
            }
            if(i==str.length()-1){
                sum+=Integer.parseInt(s);
            }
        }
        return sum;
    }


}
