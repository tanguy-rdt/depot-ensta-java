package genie_logiciel.TPbooleanExpressions;

public class Main {
    public static void main(String[] args) {
        BooleanExpression constantTrue = new BExpConstant(true);
        BooleanExpression constantFalse = new BExpConstant(false);
        BooleanExpression trueAndFalse = new BExpAnd(constantTrue, constantFalse);
        BooleanExpression trueOrFalse = new BExpOr(constantTrue, constantFalse);
        BooleanExpression notConstantTrue = new BExpNot(constantTrue);
        BooleanExpression notTrueOrFalse = new BExpNot(trueOrFalse);
        BooleanExpression anExpression1 = new BExpAnd(trueOrFalse, trueAndFalse);
        BooleanExpression notAnExpression1 = new BExpNot(anExpression1);


        System.out.println("true & false = " + trueAndFalse.evaluate());
        System.out.println("true | false = " + trueOrFalse.evaluate());
        System.out.println("not true = " + notConstantTrue.evaluate());
        System.out.println("((true|false)&(true&false)) = " + anExpression1.evaluate());
        System.out.println("not((true|false)&(true&false)) = " + notAnExpression1.evaluate());
    }
}
