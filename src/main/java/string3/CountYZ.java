package string3;

public class CountYZ {
    /*

        Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


        countYZ("fez day") → 2
        countYZ("day fez") → 2
        countYZ("day fyyyz") → 2
     */
    public static void main(String[] args) {
        String str="fez day";
        System.out.println(countYZ(str));
    }
    public static int countYZ(String str) {
        String str1=str.toLowerCase().replaceAll("[^a-z]"," ").trim();
        String arr[] = str1.split(" ");

        int count=0;

        for(String w : arr){

            if(w.endsWith("z") || w.endsWith("y")){
                count++;
            }
        }
        return count;
    }


}
