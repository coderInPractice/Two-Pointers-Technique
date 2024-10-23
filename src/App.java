public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int res = findMiddleElement(arr);
        System.out.println("Middle pointer: " + res);
    }

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
