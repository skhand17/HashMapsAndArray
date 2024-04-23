package easy;

import java.util.HashMap;

public class MaximumNoOfBallons {

    public static void main(String[] args) {

        String input = "balloon";

        int count = maxNumberOfBallons(input);
        System.out.println(count);
    }

    public static int maxNumberOfBallons(String text) {

        HashMap<Character, Integer> freqMap = new HashMap<>();
        int minimumCount = Integer.MAX_VALUE;


        for(char ch: text.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }


        minimumCount =  Math.min(minimumCount, freqMap.getOrDefault('b', 0));
        minimumCount = Math.min(minimumCount, freqMap.getOrDefault('a', 0));
        minimumCount = Math.min(minimumCount, freqMap.getOrDefault('l', 0)/2);
        minimumCount = Math.min(minimumCount, freqMap.getOrDefault('o', 0)/2);
        minimumCount = Math.min(minimumCount, freqMap.getOrDefault('n', 0));

        return minimumCount;

    }
}
