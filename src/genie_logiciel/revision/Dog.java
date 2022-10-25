package genie_logiciel.revision;

public class Dog implements GeneralThings{

    final private String howIam;

    protected Dog(){
        this.howIam = "I'm a dog";
    }

    protected void bark(){
        System.out.println("whouf");
    }

    @Override
    public void printHowIam(){
        System.out.println(howIam);
    }

    @Override
    public void eat() {
        System.out.println("I'm a dog and I eat");
    }
}