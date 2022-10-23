package task1;

import java.util.Scanner;

public class Main {
    private static Vector getVector(){
        System.out.println("Ввод координат нового вектора");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        return new Vector(x, y, z);
    }

    public static void main(String[] args) {
        Vector vector1 = getVector();
        Vector vector2 = getVector();

        System.out.println(vector1.length());
        System.out.println(vector1.scalarProduct(vector2));
        System.out.println(vector1.crossProduct(vector2));
        System.out.println(vector1.cos(vector2));
        System.out.println(vector1.add(vector2));
        System.out.println(vector1.subtract(vector2));

    }
}
