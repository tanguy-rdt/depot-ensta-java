package genie_logiciel.TPbooleanExpressions;

public class BExpOr implements BExpBinaryOperator{

    private BooleanExpression leftHandArgument;
    private BooleanExpression rightHandArgument;

    public BExpOr(BooleanExpression leftHandArgument, BooleanExpression rightHandArgument) {
        this.leftHandArgument = leftHandArgument;
        this.rightHandArgument = rightHandArgument;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean evaluate() {
        return getLeftHandArgument().evaluate() | getRightHandArgument().evaluate();
    }

    public BooleanExpression getLeftHandArgument() {
        return leftHandArgument;
    }

    public BooleanExpression getRightHandArgument() {
        return rightHandArgument;
    }
}
