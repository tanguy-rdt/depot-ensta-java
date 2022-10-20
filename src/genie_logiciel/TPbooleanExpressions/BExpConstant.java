package genie_logiciel.TPbooleanExpressions;

public class BExpConstant implements BooleanExpression {

    private final boolean value;

    public BExpConstant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean evaluate() {
        return value;
    }
}
