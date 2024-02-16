package ua.prosin.hw7;

import java.util.Random;

public class Vector {
    private final double x;
    private final double y;
    private final double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3);
        Vector vector2 = new Vector(4, 5, 6);

        // Test methods
        System.out.println("Length of vector1: " + vector1.calculateLength());
        System.out.println("Length of vector2: " + vector2.calculateLength());

        System.out.println("Cross product of vector1 and vector2: " + vector1.calculateCrossProduct(vector2));
        System.out.println("Cosine of the angle between vector1 and vector2: " + vector1.calculateCosineAngle(vector2));

        System.out.println("Sum of vector1 and vector2: " + vector1.calculateSum(vector2));
        System.out.println("Difference of vector1 and vector2: " + vector1.calculateDifference(vector2));

        int n = 5;
        Vector[] randomVectors = Vector.generateRandomVectors(n);
        System.out.println("Random vectors:");
        for (Vector vector : randomVectors) {
            System.out.println(vector);
        }
    }

    public double calculateLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector calculateCrossProduct(Vector other) {
        double newX = y * other.z - z * other.y;
        double newY = z * other.x - x * other.z;
        double newZ = x * other.y - y * other.x;
        return new Vector(newX, newY, newZ);
    }

    public double calculateCosineAngle(Vector other) {
        double dotProduct = x * other.x + y * other.y + z * other.z;
        double lengthProduct = calculateLength() * other.calculateLength();
        return dotProduct / lengthProduct;
    }

    public Vector calculateSum(Vector other) {
        double newX = x + other.x;
        double newY = y + other.y;
        double newZ = z + other.z;
        return new Vector(newX, newY, newZ);
    }

    public Vector calculateDifference(Vector other) {
        double newX = x - other.x;
        double newY = y - other.y;
        double newZ = z - other.z;
        return new Vector(newX, newY, newZ);
    }

    public static Vector[] generateRandomVectors(int N) {
        Random random = new Random();
        Vector[] vectors = new Vector[N];
        for (int i = 0; i < N; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double z = random.nextDouble();
            vectors[i] = new Vector(x, y, z);
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Task2{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}