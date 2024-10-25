public class ArrayRotation {

    public static int[] rotateArray(int[] arr) {
        int lastElement = arr[arr.length - 1];
        for(int i = arr.length - 1; i>0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = lastElement;

        return arr;
    }
}