package first;

import java.util.Scanner;

public class SquareEquationFloat {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("a = ");
        float a = in.nextFloat();
        System.out.print("b = ");
        float b = in.nextFloat();
        System.out.print("c = ");
        float c = in.nextFloat();

        float discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            float x1 = (float) (((-1) * b + Math.sqrt(discriminant)) / (2 * a));
            float x2 = (float) (((-1) * b - Math.sqrt(discriminant)) / (2 * a));
            System.out.println("Уравнение имеет два корня: х1 = " + x1 + "; x2 = " + x2);
        } else if (discriminant == 0) {
            float x = (-1) * b / (2 * a);
            System.out.println("Уравнение имеет один корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет решений");
        }
    }
}
