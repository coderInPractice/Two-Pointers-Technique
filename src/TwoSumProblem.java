import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem statement: 
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 */
public class TwoSumProblem {

    @SuppressWarnings("unchecked")
    public static List<Integer> findPairWithTargetSum(int[] arr, int targetSum) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        ArrayList<Integer> pairList = new ArrayList<>();

        while(leftPointer < rightPointer) {
            if(arr[leftPointer] + arr[rightPointer] == targetSum) {
               pairList.add(arr[leftPointer]);
               pairList.add(arr[rightPointer]);
               return pairList;
            } else if (arr[leftPointer] + arr[rightPointer] < targetSum) {
                leftPointer++;
            }else {
                rightPointer--;
            }
            
        }

        return Collections.EMPTY_LIST;
    }
    
}
