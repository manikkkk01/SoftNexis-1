public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        System.out.println("Sum of array: " + sum);
    }
}
