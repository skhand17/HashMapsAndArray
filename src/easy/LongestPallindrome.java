package easy;


import java.util.HashMap;

/*
*Given a string, determine the length of the longest palindrome that can be constructed using the characters from the string. You don't need to return the palindrome itself, just its maximum possible length.

Examples:

Input: "applepie"
Expected Output: 5
Justification: The longest palindrome that can be constructed from the string is "pepep", which has a length of 5. There are are other palindromes too but they all will be of length 5.
Input: "aabbcc"
Expected Output: 6
Justification: We can form the palindrome "abccba" using the characters from the string, which has a length of 6.
Input: "bananas"
Expected Output: 5
Justification: The longest palindrome that can be constructed from the string is "anana", which has a length of 5.
Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.
* */
public class LongestPallindrome {

    public static void main(String[] args) {

        String input = "racecar";

        int longestPallindromeConstructed = longestPallindrome(input);
        System.out.println(longestPallindromeConstructed);

    }

    public static int longestPallindrome(String input) {
        int count = 0;
        boolean oddFound = false;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(char ch : input.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for(int values : freqMap.values()){

            if(values % 2 == 0){
                count += values;
            } else {
                count += values - 1;
                oddFound = true;
            }
        }

        if(oddFound) count++;

        return count;

    }
}
