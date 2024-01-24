package ua.prosin.hw2;

public class Task2 {
    public static void main(String[] args) {
        double[] a = {1, 5};
        double[] b = {3, 5};
        double[] c = {6, 7};

        double area = calculateTriangleArea(a, b, c);

        System.out.println("Triangle Area: " + area);
    }
    public static double calculateTriangleArea(double[] a, double[] b, double[] c) {
        double area = 0.5 * Math.abs(a[0] * (a[1] - c[1]) + b[0] * (c[1] - a[1]) + c[0] * (a[1] - b[1]));
        return area;
    }
}