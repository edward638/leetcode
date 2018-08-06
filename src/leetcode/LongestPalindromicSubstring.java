package leetcode;

//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//
//        Example 1:
//
//        Input: "babad"
//        Output: "bab"
//        Note: "aba" is also a valid answer.
//
//        Example 2:
//
//        Input: "cbbd"
//        Output: "bb"



public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int[] ans = new int[2];
        if (s.length() <= 1) return s;
        for (int x = 0; x < s.length()-1; x++) {
            update(s, x, x, ans);
            update(s, x, x+1, ans);
        }
        return s.substring(ans[0], ans[1] + 1);
    }

    public void update(String s, int left, int right, int[] ans) {
        if (s.charAt(left) != s.charAt(right)) {
            return;
        }
        while (left > 0 && right < s.length()-1) {
            if (s.charAt(left-1) != s.charAt(right+1)) {
                break;
            } else {
                left--;
                right++;
            }
        }
        if (ans[1] - ans[0] < right - left) {
            ans[0] = left;
            ans[1] = right;
        }
    }
}
