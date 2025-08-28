public class searchTwoD {
    public static void main(String args[]) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 3;

        boolean s = searchMatrix(matrix, target);
        System.out.println("Is the element present? " + s);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0)
            return false;
        int n = matrix[0].length;

        int start = 0;
        int end = m * n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int row_num = mid / n;
            int col_num = mid % n;

            if (matrix[row_num][col_num] == target) {
                return true;
            } else if (matrix[row_num][col_num] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
