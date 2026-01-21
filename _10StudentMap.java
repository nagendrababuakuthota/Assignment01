import java.util.LinkedHashMap;
import java.util.Map;
public class _10StudentMap {
    public static void main(String[] args) {
        Map<Integer, String> students = new LinkedHashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "Diana");
        System.out.println("Student Details (Insertion Order):");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() +
                               ", Name: " + entry.getValue());
        }
    }
}
