package leetcode;

import java.util.HashMap;
import java.util.Map;

//Given a string, find the length of the longest substring without repeating characters.
//
//        Examples:
//
//        Given "abcabcbb", the answer is "abc", which the length is 3.
//
//        Given "bbbbb", the answer is "b", with the length of 1.
//
//        Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring,
//        "pwke" is a subsequence and not a substring.
//

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int start = 0;
        int max = 1;
        Map<Character, Integer> map = new HashMap<>();
        for (int x = 0; x < s.length(); x++) {
            char c = s.charAt(x);
            if (! map.containsKey(c) || map.get(c) < start) {
                map.put(c, x);
            } else {
                start = map.get(c) + 1;
                map.put(c, x);
                // System.out.println(start);
            }
            if (x - start + 1 > max) {
                max = x - start + 1;
            }
        }
        return max;
    }
}
