package genie_logiciel.TPExpArithmetiques;

public class InfixMain{
    public static void main(String[] args) {
        InfixValue v1 = new InfixValue(1);
        InfixValue v2 = new InfixValue(2);
        InfixValue v5 = new InfixValue(5);

        InfixOperator plus1_2 = new InfixOperator(v1, v2 , InfixOperatorType.PLUS);
        InfixOperator expression = new InfixOperator(plus1_2, v5, InfixOperatorType.MINUS);

        System.out.println(expression + " = " + expression.evaluate());

        v1.setValue(7);

        System.out.println(expression + " = " + expression.evaluate());
    }
}
