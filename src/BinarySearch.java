/*
 * Implement binary search algorithm.
 * BS: It divides array into two parts untill search target is found.
 * Implementation: Iteration method
 * 
 * Time Complexity: O(logn)
 * Space Complexity: O(1)
 */

public class BinarySearch {

    public static int searchElement(int[] arr, int elementToSearch) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        

        while(leftPointer <= rightPointer) {
            int midElement = (leftPointer + rightPointer) / 2;
            if(arr[midElement] == elementToSearch) {
                return midElement;
            } else if(arr[midElement] > elementToSearch) {
                rightPointer = midElement - 1;
            } else {
                leftPointer = midElement + 1;
            }
        }

        return -1;

    }
    
}
