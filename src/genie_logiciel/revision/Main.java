package genie_logiciel.revision;

public class Main {

    public static void main(String[] args){
        Dog dog = new Dog();
        Person person = new Person("Pierre");

        dog.printHowIam();
        dog.bark();
        dog.eat();

        person.printHowIam();
        person.talk();
        person.eat();
    }
}