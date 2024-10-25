public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        // int[] arr = {3,2,4};
        // int res = FindMiddleIndex.findMiddleElement(arr);
        // System.out.println("FindMiddleIndex: Middle pointer: " + res);
        // System.out.println("FindMiddleIndex: Middle element: " + arr[res]);


        // boolean pairListExist = TwoSumProblem.findPairWithTargetSumBetterSoln(arr, 6);
        // // pairList.forEach(i -> System.out.println("FindPairWithTargetSum: pairList " + i));
        // System.out.println("pairListExist " + pairListExist);

        //int[] arr2 = {1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8};
        //System.out.println(SingleOcurranceElement.findSingleOcurranceElementUsingBinarySearch(arr2));

        // System.out.println(RemoveDuplicates.removeDuplicatesFromArray(arr2));

        // int[] arr3 = {10, 20, 10, 30, 50, 10};
        // int k = 10;
        // RemoveGivenElement.removeOcurranceOfElement(arr3, k).forEach(i -> System.out.print(i + " "));

        // int a[] = { 2, 3, 4, 10, 40 };
        // int x = 10;
        // System.out.println("BS " + BinarySearch.searchElement(a, x));

        //FibonacciSeries.printFiboSeries(18);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] res = ArrayRotation.rotateArray(arr);
        for (int res2 : res) {
            System.out.print(res2 + "\t");
        }

    }


}
