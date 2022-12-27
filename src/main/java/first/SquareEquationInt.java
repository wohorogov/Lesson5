package first;

import java.util.Scanner;

public class SquareEquationInt {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.print("c = ");
        int c = in.nextInt();

        int discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            int x1 = (int) (((-1) * b + Math.sqrt(discriminant)) / (2 * a));
            int x2 = (int) (((-1) * b - Math.sqrt(discriminant)) / (2 * a));
            System.out.println("Уравнение имеет два корня: х1 = " + x1 + "; x2 = " + x2);
        } else if (discriminant == 0) {
            int x = (-1) * b / (2 * a);
            System.out.println("Уравнение имеет один корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет решений");
        }
    }
}
