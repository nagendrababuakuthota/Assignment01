import java.util.Set;
import java.util.TreeSet;
public class _08EmployeeNames {
    public static void main(String[] args) {
        Set<String> employees = new TreeSet<>();
        employees.add("Ravi");
        employees.add("Anita");
        employees.add("Suresh");
        employees.add("Meena");
        employees.add("Kiran");
        System.out.println("Employee names in sorted order:");
        for (String name : employees) {
            System.out.println(name);
        }
    }
}
