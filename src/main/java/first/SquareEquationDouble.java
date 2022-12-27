package first;

import java.util.Scanner;

public class SquareEquationDouble {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("c = ");
        double c = in.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = ((-1) * b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = ((-1) * b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Уравнение имеет два корня: х1 = " + x1 + "; x2 = " + x2);
        } else if (discriminant == 0) {
            double x = (-1) * b / (2 * a);
            System.out.println("Уравнение имеет один корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет решений");
        }
    }
}

