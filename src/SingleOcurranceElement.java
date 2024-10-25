/*
 * Problem Statement:
 * Find the element which has single ocurrance in the array
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */

import java.util.ArrayList;
import java.util.HashSet;

public class SingleOcurranceElement {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int findSingleOcurranceElement(int[] nums) {
        int XOR = 0;
        for (int i = 0; i < nums.length; i++) {
            XOR ^= nums[i]; //XOR of duplicates will be zero, 
                            //hence non-duplicate value will returned
        }
        return XOR;
    }

    /*
     * All elements before the element that occurs once have the first occurrence at 
     * even index (0, 2, ..) and the next occurrence at odd index (1, 3, …). 
     * And all elements after the element that occurs once have the first occurrence 
     * at an odd index and the next occurrence at an even index. 
     * 
     * Find the middle index, say ‘mid‘. If mid is odd, then reduce it by 1 to make it even
     * If ‘arr[mid] and arr[mid+1] are same, then the single element must be on the right side
     * Else single element must be on the left side.
     * 
     * Time Complexity: O(log n)  
     * Space Complexity: O(1)
     */
    public static int findSingleOcurranceElementUsingBinarySearch(int[] nums) {
        int leftPointer = 0;
        int rightPointer = nums.length -1;

        while(leftPointer < rightPointer) {
            int mid = (leftPointer + rightPointer) / 2;
            
            if(mid % 2 == 1) {
                mid--;
            }

            if(nums[mid] == nums[mid + 1]) {
                leftPointer = mid + 2;
            } else {
                rightPointer = mid;
            }
        }

        return nums[leftPointer];
    }

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(m+n)
     */
    public static int findSingleOcurranceElementUsingHashSet(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(Integer item: nums) {
            hashSet.add(item);
        }

        ArrayList<Integer> output = new ArrayList<>(hashSet);
        return output.get(0);
    }
    
}
