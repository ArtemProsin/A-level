package ua.prosin.hw7;

import java.util.Random;

public class Task2 {
    private final double x;
    private final double y;
    private final double z;

    public Task2(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Task2 vector1 = new Task2(1, 2, 3);
        Task2 vector2 = new Task2(4, 5, 6);

        // Test methods
        System.out.println("Length of vector1: " + vector1.calculateLength());
        System.out.println("Length of vector2: " + vector2.calculateLength());

        System.out.println("Cross product of vector1 and vector2: " + vector1.calculateCrossProduct(vector2));
        System.out.println("Cosine of the angle between vector1 and vector2: " + vector1.calculateCosineAngle(vector2));

        System.out.println("Sum of vector1 and vector2: " + vector1.calculateSum(vector2));
        System.out.println("Difference of vector1 and vector2: " + vector1.calculateDifference(vector2));

        int n = 5;
        Task2[] randomVectors = Task2.generateRandomVectors(n);
        System.out.println("Random vectors:");
        for (Task2 vector : randomVectors) {
            System.out.println(vector);
        }
    }

    public double calculateLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Task2 calculateCrossProduct(Task2 other) {
        double newX = y * other.z - z * other.y;
        double newY = z * other.x - x * other.z;
        double newZ = x * other.y - y * other.x;
        return new Task2(newX, newY, newZ);
    }

    public double calculateCosineAngle(Task2 other) {
        double dotProduct = x * other.x + y * other.y + z * other.z;
        double lengthProduct = calculateLength() * other.calculateLength();
        return dotProduct / lengthProduct;
    }

    public Task2 calculateSum(Task2 other) {
        double newX = x + other.x;
        double newY = y + other.y;
        double newZ = z + other.z;
        return new Task2(newX, newY, newZ);
    }

    public Task2 calculateDifference(Task2 other) {
        double newX = x - other.x;
        double newY = y - other.y;
        double newZ = z - other.z;
        return new Task2(newX, newY, newZ);
    }

    public static Task2[] generateRandomVectors(int N) {
        Random random = new Random();
        Task2[] vectors = new Task2[N];
        for (int i = 0; i < N; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double z = random.nextDouble();
            vectors[i] = new Task2(x, y, z);
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Task2{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}