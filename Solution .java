import java.util.*;

public class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result.append(ch);
            } else if (ch == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else if (ch == '#') {
                result.append(result.toString());  // duplicate and append
            } else if (ch == '%') {
                result.reverse();  // reverse the result
            }
        }

        return result.toString();
    }

    // Main method to test cases
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1
        String input1 = "a#b%*";
        String output1 = sol.processStr(input1);
        System.out.println(" Input:" + input1);
        System.out.println(" Output:" + output1); // Expected: "ba"

        // Test Case 2
        String input2 = "z*#";
        String output2 = sol.processStr(input2);
        System.out.println(" Input: " + input2);
        System.out.println(" Output: " + output2); // Expected: ""

        // Additional Test Case
        String input3 = "ab#%c*";
        String output3 = sol.processStr(input3);
        System.out.println("Input: " + input3);
        System.out.println("Output: " + output3); // Dry run to confirm
    }
}
