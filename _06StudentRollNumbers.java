import java.util.LinkedHashSet;

public class _06StudentRollNumbers {
    public static void main(String[] args) {

        LinkedHashSet<Integer> rollNumbers = new LinkedHashSet<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(101); 
        rollNumbers.add(104);
        System.out.println("Student Roll Numbers:");
        for (int roll : rollNumbers) {
            System.out.println(roll);
        }
    }
}
