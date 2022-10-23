package task1;

import java.util.Objects;

public class Vector {
    double x;
    double y;
    double z;


    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Double.compare(vector.x, x) == 0 && Double.compare(vector.y, y) == 0 && Double.compare(vector.z, z) == 0;
    }

    public int hashCode() {
        return Objects.hash(x, y, z);
    }
    // Длина вектора. Корень из суммы квадратов

    double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    // метод, вычисляющий скалярное произведение

    double scalarProduct(Vector vector) {
        return vector.y * this.y + vector.x * this.x + vector.z * this.z;
    }
    // метод, вычисляющий векторное произведение

    Vector crossProduct(Vector vector) {
        double newX = this.y * vector.z - this.z * vector.y;
        double newY = this.z * vector.x - this.x * vector.z;
        double newZ = this.x * vector.y - this.y * vector.x;

        return new Vector(newX, newY, newZ);
    }

    // Косинус между двумя векторами
    double cos(Vector vector) {
        return this.scalarProduct(vector) / (this.length() * vector.length());
    }

    // Сумма двух векторов
    Vector add(Vector vector) {
        double newX = this.x + vector.x;
        double newY = this.y + vector.y;
        double newZ = this.z + vector.z;

        return new Vector(newX, newY, newZ);
    }

    // Разность двух веторов
    Vector subtract(Vector vector) {
        double newX = this.x - vector.x;
        double newY = this.y - vector.y;
        double newZ = this.z - vector.z;

        return new Vector(newX, newY, newZ);
    }
}
