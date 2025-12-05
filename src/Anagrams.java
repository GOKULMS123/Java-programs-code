import java.util.Arrays;

public class Anagrams {

    public static boolean areAnagrams(String s1, String s2) {
        // remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // if lengths differ, not an anagram
        if (s1.length() != s2.length()) return false;

        // convert to char array and sort
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        // compare
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(areAnagrams(s1, s2));  // true
    }
}
