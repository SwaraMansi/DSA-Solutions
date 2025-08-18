// LeetCode 50: Pow(x, n) (Recursion)
public class PowXN {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) { x = 1/x; N = -N; }
        return fastPow(x, N);
    }
    private double fastPow(double x, long n) {
        if (n == 0) return 1.0;
        double half = fastPow(x, n/2);
        if (n % 2 == 0) return half * half;
        return half * half * x;
    }
    public static void main(String[] args) {
        PowXN s = new PowXN();
        System.out.println(s.myPow(2.0, 10)); // 1024.0
        System.out.println(s.myPow(2.0, -2)); // 0.25
    }
}
