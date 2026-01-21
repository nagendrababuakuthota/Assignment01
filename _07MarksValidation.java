public class _07MarksValidation {
    static void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        System.out.println("Valid marks: " + marks);
    }

    public static void main(String[] args) {
        try {
            validateMarks(105);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}
