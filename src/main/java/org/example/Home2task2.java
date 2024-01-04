
public class Home2task2 {
    public static void main(String[] args) {
        double[] pointA = {1, 5};
        double[] pointB = {3, 5};
        double[] pointC = {6, 7};

        double area = calculateTriangleArea(pointA, pointB, pointC);

        System.out.println("Площадь треугольника: " + area);
    }
    public static double calculateTriangleArea(double[] A, double[] B, double[] C) {
        double area = 0.5 * Math.abs(A[0] * (B[1] - C[1]) + B[0] * (C[1] - A[1]) + C[0] * (A[1] - B[1]));
        return area;
    }
}