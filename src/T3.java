import java.util.Scanner;

public class T3 {
    private static long diffDigitSum(long n) {
        long evens = 0, odds = 0;
        int i = 0;
        while (n > 0) {
            if ((i % 2) == 0) {
                evens += n % 10;
            } else {
                odds += n % 10;
            }
            n /= 10;
            i++;
        }
        return Math.abs(evens - odds);
    }

    public static boolean isDivisibleBy11(long n) {
        long q = diffDigitSum(n);
        return q == 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            long r = s.nextLong();
            if (isDivisibleBy11(r)) System.out.println("Число " + r + " делится на 11\n" + r + " / 11 = " + (r / 11));
            else System.out.println("Число " + r + " не делится на 11");
        }
    }
}
