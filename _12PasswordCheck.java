class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
public class _12PasswordCheck {
    public static void main(String[] args) {
        String password = "abc123"; 
        try {
            checkPassword(password);
            System.out.println("Password is valid");
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    static void checkPassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long");
        }
    }
}
