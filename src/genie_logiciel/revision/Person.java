package genie_logiciel.revision;

public class Person implements GeneralThings{

    final private String howIam;
    final private String myName;


    protected Person(String myName){
        this.howIam = "I'm a preson";
        this.myName = myName;
    }

    protected void talk(){
        System.out.println("Hello, my name is " + myName);
    }

    @Override
    public void printHowIam(){
        System.out.println(howIam);
    }

    @Override
    public void eat() {
        System.out.println("I'm a person and I eat");
    }
}