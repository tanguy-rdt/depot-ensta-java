package genie_logiciel.TPExpArithmetiquesObservateur;

public class ChangePrinter implements InfixObserver{
    @Override
    public void notify(InfixExpression subject) {
        System.out.println(subject + " = " + subject.evaluate());
    }
}
