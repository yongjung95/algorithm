package 스킬체크테스트Lv2;

public class main {

    static long[] memo;
    public static long fibonacci(int n) {
        if (n <= 1)
            return n;
        else if (memo[n] != 0)
            return memo[n];
        else
            return memo[n] = fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args) {
        int n = 1;
        memo = new long[n+1];
        System.out.println(fibonacci(n)%1234567);
    }
}
