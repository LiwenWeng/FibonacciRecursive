public class Fibonacci {
    private long[] cache;
    private int nthNum;

    public Fibonacci() {
        nthNum = 92;
        cache = new long[93];
    }

    public Fibonacci(int num) {
        nthNum = num;
        cache = new long[num + 1];
    }

    public void setNthNum(int num) {
        nthNum = num;
        cache = new long[num + 1];
    }

    private long getFibonacciNumber(int n) {
        if (n <= 1) {
            return n;
        }

        if (cache[n] != 0) {
            return cache[n];
        }

        long nthFibonacciNumber = getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
        cache[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }

    public long getFibonacciNumberAtNth() {
        return getFibonacciNumber(nthNum);
    }

    public long[] getFibonacciNumbersUpToNth() {
        long[] fibonacciArray = new long[nthNum + 1];

        for (int i = 0; i < nthNum + 1; i++) {
            fibonacciArray[i] = getFibonacciNumber(i);
        }

        return fibonacciArray;
    }
}
