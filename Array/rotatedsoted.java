public class rotatedsoted {
    public static void main(String args[]) {
        class Solution {
            public boolean check(int[] nums) {

                int cnt = 0;
                int n = nums.length;

                if (nums[0] < nums[n - 1]) {
                    cnt++;
                }

                for (int i = 1; i < n; i++) {
                    if (nums[i - 1] > nums[i]) {
                        cnt++;

                        if (cnt > 1) {
                            return false;
                        }
                    }
                }
                return true;

            }
        }
    }
}
