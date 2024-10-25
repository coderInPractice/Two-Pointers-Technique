public class FibonacciSeries {

    public static void printFiboSeries(int uptoNum) {
        int a = 0;
        int b = 1;
        int temp;
        System.out.print(a + ", " + b);
        for(int i=2; i<uptoNum; i++) {
            temp = a + b;
            System.out.print(", " + temp);
            a = b;
            b = temp;
        }
    }
}