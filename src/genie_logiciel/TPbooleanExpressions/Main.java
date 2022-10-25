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


        System.out.println(trueAndFalse + "=" + trueAndFalse.evaluate());
        System.out.println(trueOrFalse  + "=" + trueOrFalse.evaluate());
        System.out.println(notConstantTrue  + "=" + notConstantTrue.evaluate());
        System.out.println(anExpression1  + "=" + anExpression1.evaluate());
        System.out.println(notAnExpression1  + "=" + notAnExpression1.evaluate());
    }
}
