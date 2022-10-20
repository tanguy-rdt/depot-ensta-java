package genie_logiciel.TPintro;

public class Student extends Person{
    private String schoolName;

    private Student(String firstName, String lastName, int age, String schoolName){
        super(firstName, lastName, age);
        this.schoolName = schoolName;
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        System.out.println("I'm a student at " + schoolName + ".");
    }

    static public void main (String[] args){
        Person alice = new Student("Alice", "Alpha", 20, "ENSTA");
        alice.introduceYourself();
    }
}
