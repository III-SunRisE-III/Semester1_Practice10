import java.util.Scanner;

public class T4 {
    public static long digitSum(long n) {
        long s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public static long digitRoot(long n) {
        if ((n / 10) == 0) return n;
        return digitRoot(digitSum(n));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            long r = s.nextLong();
            System.out.println("Цифровой корень " + r + " = " + digitRoot(r));
        }
    }
}
