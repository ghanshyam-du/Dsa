public class BeySell {
    public static void main(String args[]) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int res = MaxIP(arr);
        System.out.println("The maximum profit of the stock is:" + res);

    }

    public static int MaxIP(int[] arr) {
        int a = arr.length - 1;

        int maxP = 0;
        int minPr = Integer.MAX_VALUE;

        for (int i = 0; i < a; i++) {
            if (minPr > arr[i]) {
                minPr = arr[i];
            } else if (arr[i] - minPr > maxP) {
                maxP = arr[i] - minPr;
            }
        }

        return maxP;
    }

}
