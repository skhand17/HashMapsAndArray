package easy;


import java.util.HashMap;
import java.util.Map;

/*
*Given a string, identify the position of the first character that appears only once in the string. If no such character exists, return -1.

Examples

Example 1:

Input: "apple"
Expected Output: 0
Justification: The first character 'a' appears only once in the string and is the first character.
Example 2:

Input: "abcab"
Expected Output: 2
Justification: The first character that appears only once is 'c' and its position is 2.
Example 3:

Input: "abab"
Expected Output: -1
Justification: There is no character in the string that appears only once.
Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters
*
*
* */
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "abcab";
        int index = firstUniChar(str);
        System.out.println(index);
    }

    public static int firstUniChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        for(char ch : s.toCharArray()){
            if(map.get(ch) == 1){
                return s.indexOf(ch);
            }
        }

        return -1;
    }
}
