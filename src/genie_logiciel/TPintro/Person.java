package genie_logiciel.TPintro;

public class Person{

    private final String firstName;
    private final String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduceYourself() {
        System.out.println("My name is " + firstName + " " + lastName + " and I'm " + age + " years old.");
    }

    static public void main(String[] args) {
        Person alice = new Person("Alice", "Alpha", 20);

        alice.introduceYourself();
    }

}

