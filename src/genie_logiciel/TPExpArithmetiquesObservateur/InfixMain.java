package genie_logiciel.TPExpArithmetiquesObservateur;

public class InfixMain{
    public static void main(String[] args) {
        InfixValue v1 = new InfixValue(1);
        InfixValue v2 = new InfixValue(2);
        InfixOperator expression = new InfixOperator(v1, v2, InfixOperatorType.PLUS);

        ChangePrinter changePrinter = new ChangePrinter();
        expression.addObserver(changePrinter);
        v1.addObserver(changePrinter);
        v2.addObserver(changePrinter);

        v1.setValue(0);
        v2.setValue(3);
        v1.setValue(4);
    }
}
