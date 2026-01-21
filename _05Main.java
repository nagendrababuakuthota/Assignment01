class Person{
    void showRole(){
        System.out.println("Person");
}
}
class Student extends Person{
    void showRole(){
        System.out.println("student");
}
}
public class _05Main{
    public static void main(String[] args){
        Person p= new Person();
        p.showRole();
}
}



