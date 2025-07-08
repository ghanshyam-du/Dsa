public class algo {
    public static int Karatsuba(int a, int b)
    {
        if(a < 10 || b < 10)
        {
            return a*b;
        }
        int m = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
        int m2 = m/2;
        int a1 = a/(int)Math.pow(10, m2);
        int a2 = a%(int)Math.pow(10, m2);
        int b1 = b/(int)Math.pow(10, m2);
        int b2 = b%(int)Math.pow(10, m2);
        int z0 = Karatsuba(a2, b2);
        int z1 = Karatsuba((a1+a2), (b1+b2));
        int z2 = Karatsuba(a1, b1);
        return (int)(z2*Math.pow(10, 2*m2) + ((z1-z2-z0)*Math.pow(10, m2)) + z0);
    }
    public static void main(String args[])
    {
        System.out.println(Karatsuba(25, 25));

    }
}
