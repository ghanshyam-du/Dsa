import java.util.*;
public class Fact {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = Factorial(n);
        System.out.println(a);


    }

    public static int Factorial(int n){
        if(n == 0){
            return 1;
        }
        return n*Factorial(n-1);
    }

}
