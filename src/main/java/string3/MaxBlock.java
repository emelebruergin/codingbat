package string3;

public class MaxBlock {
    /*

        Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.


        maxBlock("hoopla") → 2
        maxBlock("abbCCCddBBBxx") → 3
        maxBlock("") → 0
     */
    public static void main(String[] args) {
        String str="abbCCCddBBBxx";
        System.out.println(maxBlock(str));

    }
    public static int maxBlock(String str) {
        int counter=0;
        int count=1;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==str.charAt(i)){
                count++;
            }else{
                counter=Math.max(counter,count);
                count=1;
            }
        }
        if(str.length()==0){
            return 0;
        }
        counter=Math.max(counter,count);
        return counter;


    }



    }


