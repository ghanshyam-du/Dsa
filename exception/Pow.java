import java.util.*;
public class Pow {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and n:");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = pow(x,n);
        System.out.println(ans);
    }

    // public static int pow(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }

    //     return x * pow(x,n-1);

    // }
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        if(n %2 == 0){
            return pow(x,n/2)* pow(x,n/2);
        }
        else{
            return pow(x,n/2)* pow(x,n/2)*x;
        }
    }
}
