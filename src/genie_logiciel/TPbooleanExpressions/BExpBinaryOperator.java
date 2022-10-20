package genie_logiciel.TPbooleanExpressions;

public interface BExpBinaryOperator extends BooleanExpression{
    BooleanExpression getLeftHandArgument();
    BooleanExpression getRightHandArgument();
}
