package easy;

import java.util.HashMap;

/*
* Given an array of integers, identify the highest value that appears only once in the array. If no such number exists, return -1.

Examples:

Example 1:

Input: [5, 7, 3, 7, 5, 8]
Expected Output: 8
Justification: The number 8 is the highest value that appears only once in the array.
Example 2:

Input: [1, 2, 3, 2, 1, 4, 4]
Expected Output: 3
Justification: The number 3 is the highest value that appears only once in the array.
Example 3:

Input: [9, 9, 8, 8, 7, 7]
Expected Output: -1
Justification: There is no number in the array that appears only once.
Constraints:

1 <= nums.length <= 2000
0 <= nums[i] <= 1000
*
* */
public class LargestUniqueNumber {

    public static void main(String[] args) {

        int[] nums = new int[] {1, 2, 3, 2, 1, 4, 4};
        int largestUniqueNumber = largestUniqNumber(nums);
        System.out.println(largestUniqueNumber);
    }

    public static int largestUniqNumber(int [] A){

        int maxNumber = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<A.length; i++){
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        for(int i=0; i<A.length; i++){

            if(map.get(A[i]) == 1){
                maxNumber = Math.max(maxNumber, A[i]);
            }
        }

        return maxNumber == Integer.MIN_VALUE ? -1 : maxNumber;

    }


}
