package genie_logiciel.TPbooleanExpressions;

public class BExpAnd implements BExpBinaryOperator{

    private BooleanExpression leftHandArgument;
    private BooleanExpression rightHandArgument;

    public BExpAnd(BooleanExpression leftHandArgument, BooleanExpression rightHandArgument) {
        this.leftHandArgument = leftHandArgument;
        this.rightHandArgument = rightHandArgument;
    }

    @Override
    public boolean evaluate() {
        return getLeftHandArgument().evaluate() & getRightHandArgument().evaluate();
    }

    @Override
    public String toString() {
        return "(" + leftHandArgument.evaluate() +
                " & " + rightHandArgument.evaluate() +
                ')';
    }

    public BooleanExpression getLeftHandArgument(){
        return leftHandArgument;
    }

    public BooleanExpression getRightHandArgument(){
        return rightHandArgument;
    }
}
