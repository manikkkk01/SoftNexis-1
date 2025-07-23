public class CircleOperations {
    public static void main(String[] args) {
        double radius = 5.0;
        System.out.printf("Area: %.2f\n", area(radius));
        System.out.printf("Circumference: %.2f\n", circumference(radius));
    }

    static double area(double r) {
        return Math.PI * r * r;
    }

    static double circumference(double r) {
        return 2 * Math.PI * r;
    }
}
