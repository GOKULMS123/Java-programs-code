/*==================DYNAMIC SLIDING WINDOW ==============================*/
/*--Given a string s, find the length of the 
longest substring without duplicate characters.-- */
public class SW_Longest_substring_no_repeat_char {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int left = 0;
        int maxLen = 0;
        int[] freq = new int[256];

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            freq[c]++;
            // If a character repeats, shrink from left
            while(freq[c] > 1){
                freq[s.charAt(left)]--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println(maxLen);
    }

}
