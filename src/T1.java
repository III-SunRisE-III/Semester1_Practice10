import java.util.Arrays;
import java.util.Scanner;

public class T1 {
    public static String pointOnLine(double[] p, double k, double b) {
        double epsilon = 1e-12;
        if (Math.abs(p[1] - k * p[0] - b) < epsilon) return "";
        else return " не";
    }

    public static String output(double[] p, double k, double b, String y) {
        String pt = Arrays.toString(p);
        if (b == 0) {
            if (k == 1)
                return "Точка " + pt + y + " лежит на прямой y = x";
            else if (k == -1)
                return "Точка " + pt + y + " лежит на прямой y = -x";
            return "Точка " + pt + y + " лежит на прямой y = " + k + "x";
        }
        if (k == 1)
            return "Точка " + pt + y + " лежит на прямой y = x" + " + " + b;
        else if (k == -1)
            return "Точка " + pt + y + " лежит на прямой y = -x" + " + " + b;
        return "Точка " + pt + y + " лежит на прямой y = " + k + "x" + b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            double x = s.nextDouble(), y = s.nextDouble();
            double[] point = {x, y};

            double k = s.nextDouble(), b = s.nextDouble();

            System.out.println(output(point, k, b, pointOnLine(point, k, b)));
        }
    }
}
