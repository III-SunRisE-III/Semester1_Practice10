import java.util.Scanner;

public class T2 {
    public static double dist(double[] p1, double[] p2) {
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }
    public static boolean areEqual(double a, double b) {
        return !(Math.abs(a - b) < 1e-9);
    }
    public static boolean areEqual(double[] a, double[] b) {
        return areEqual(a[0], b[0]) || areEqual(a[1], b[1]);
    }
    public static boolean isLegal(double[] p1, double[] p2, double[] p3) {
        double AB = dist(p1, p2);
        double BC = dist(p2, p3);
        double AC = dist(p1, p3);
        if ((AB + BC) > AC) return false;
        if ((BC + AC) > AB) return false;
        if ((AB + AC) > BC) return false;
        return areEqual(p1, p2) && areEqual(p2, p3) && areEqual(p1, p3);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] A = {s.nextDouble(), s.nextDouble()};
        double[] B = {s.nextDouble(), s.nextDouble()};
        double[] C = {s.nextDouble(), s.nextDouble()};

        double AB = dist(A, B);
        double BC = dist(B, C);
        double AC = dist(A, C);
        boolean x = areEqual(AB, BC), y = areEqual(BC, AC), z = areEqual(AB, AC);
        if (isLegal(A, B, C)) {
            if (x && y && z) System.out.println("Треугольник равносторонний");
            else if (!z && y && x) System.out.println("Треугольник равнобедренный");
            else if (!y && x && z) System.out.println("Треугольник равнобедренный");
            else if (!x && y && z) System.out.println("Треугольник равнобедренный");
            else System.out.println("Треугольник ни равнобедренный, либо равносторонний");
        } else System.out.println("Треугольник не существует");
    }
}
