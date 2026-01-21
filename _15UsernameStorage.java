import java.util.HashSet;
public class _15UsernameStorage {
    public static void main(String[] args) {
        HashSet<String> usernames = new HashSet<>();
        usernames.add("john123");
        usernames.add("alice456");
        usernames.add("bob789");
        System.out.println("Does 'alice456' exist? " + usernames.contains("alice456"));
        System.out.println("Usernames: " + usernames);
    }
}