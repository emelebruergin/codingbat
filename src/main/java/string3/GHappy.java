package string3;

public class GHappy {
    /*
    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.


        gHappy("xxggxx") → true
        gHappy("xxgxx") → false
        gHappy("xxggyygxx") → false

     */
    public static void main(String[] args) {
        String str="ggyygxx";
        System.out.println(gHappy(str));

    }
    public static boolean gHappy(String str) {
        // String içindeki tüm 'g' karakterleri kontrol edilir
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                // Eğer karakter 'g' ise, solundaki ve sağındaki karakterlere bakılır
                // Eğer solundaki veya sağındaki karakter 'g' ise, mutlu 'g' karakteri vardır
                if ((i > 0 && str.charAt(i - 1) == 'g') ||
                        (i < str.length() - 1 && str.charAt(i + 1) == 'g')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        // Tüm koşullar sağlanırsa true döndürülür
        return true;
    }
}
