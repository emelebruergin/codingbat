package string3;

public class NotReplace {
    /*

        Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)


        notReplace("is test") → "is not test"
        notReplace("is-is") → "is not-is not"
        notReplace("This is right") → "This is not right"
     */

    public static void main(String[] args) {
        String str="is-is";
        System.out.println(notReplace(str));

    }
    public static String notReplace(String str) {
        int n = str.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i + 1 < n && str.charAt(i) == 'i' && str.charAt(i + 1) == 's' &&
                    (i == 0 || !Character.isLetter(str.charAt(i - 1))) &&
                    (i + 2 == n || !Character.isLetter(str.charAt(i + 2)))) {
                result.append("is not");
                i++;
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }


}
