public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int res = FindMiddleIndex.findMiddleElement(arr);
        System.out.println("FindMiddleIndex: Middle pointer: " + res);
        System.out.println("FindMiddleIndex: Middle element: " + arr[res]);
    }


}
