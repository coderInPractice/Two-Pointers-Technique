public class FindMiddleIndex {

    public static int findMiddleElement(int[] arr) {

        int leftPointer = 0;
        int rightPointer = arr.length -1;

        while (leftPointer < rightPointer) {
            ++leftPointer;
            --rightPointer;
        }

        return leftPointer;
    }
}