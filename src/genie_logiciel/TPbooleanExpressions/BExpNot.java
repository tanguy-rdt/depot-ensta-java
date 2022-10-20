package genie_logiciel.TPbooleanExpressions;

public class BExpNot implements BExpUnaryOperator{

    private BooleanExpression argument;

    public BExpNot(BooleanExpression argument) {
        this.argument = argument;
    }

    public BooleanExpression getArgument() {
        return argument;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean evaluate() {
        return !argument.evaluate();
    }
}
