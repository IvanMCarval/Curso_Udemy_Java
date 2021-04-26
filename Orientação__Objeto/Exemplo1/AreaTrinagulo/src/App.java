import java.util.Scanner;
import java.util.Locale;

import entities.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Area of X: " + areaX);
        System.out.println("Area of y: " + areaY);

        sc.close();
    }
}
