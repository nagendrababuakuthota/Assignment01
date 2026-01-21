public class _11NestedTryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4};
            System.out.println(arr[10]);
            try {
                int result = 10 / 0; 
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e.getMessage());  
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: " + e.getMessage());
        }
    }
}


