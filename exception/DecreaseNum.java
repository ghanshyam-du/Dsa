import java.util.*;
import java.io.*;
public class DecreaseNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        printDecrease(n);
      

    }
    public static void printDecrease(int n ){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecrease(n-1);
         System.out.println(n);
    }
    
}
