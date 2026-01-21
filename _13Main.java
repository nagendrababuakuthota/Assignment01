interface Calculator {
    int calculate(int a, int b);
}
public class _13Main {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;
        int sum = addition.calculate(5, 3);
        System.out.println("Addition: 5 + 3 = " + sum);
        int product = multiplication.calculate(5, 3);
        System.out.println("Multiplication: 5 * 3 = " + product);
    }
}
