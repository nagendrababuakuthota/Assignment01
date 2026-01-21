class _01Patient {
    String name;
    double height; 
    double weight; 

    double computeBMI() {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        Patient p = new Patient();
        p.name = "John";
        p.height = 1.75;
        p.weight = 70;

        System.out.println("BMI of " + p.name + " is: " + p.computeBMI());
    }
}
