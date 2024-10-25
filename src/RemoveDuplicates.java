import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;

/*
 * Problem Statement:
 * Remove all the duplicates from the array 
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 */

public class RemoveDuplicates {

    public static List<Integer> removeDuplicatesFromArray(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length -1 ; i++) {
            set.add(nums[i]);
        }

        ArrayList<Integer> output = new ArrayList<>(set);
        return output;

    }
    
}
