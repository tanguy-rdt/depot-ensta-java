package genie_logiciel.TPExpArithmetiquesObservateur;

import java.util.HashSet;
import java.util.Set;

public class InfixOperator extends InfixExpressionBase implements InfixObserver {

    private InfixExpression rightArgument;
    private InfixExpression leftArgument;
    private InfixOperatorType type;

    public InfixOperator(InfixExpression leftArgument, InfixExpression rightArgument, InfixOperatorType type){
        this.rightArgument = rightArgument;
        this.leftArgument = leftArgument;
        this.type = type;
        rightArgument.addObserver(this);
        leftArgument.addObserver(this);
    }

    @Override
    public void notify(InfixExpression subject){
        notifyAllObserver();
    }


    @Override
    public int evaluate() {
        switch (getType()) {
            case PLUS:
                return getLeftArgument().evaluate() + getRightArgument().evaluate();
            case MINUS:
                return getLeftArgument().evaluate() - getRightArgument().evaluate();
            case MULTIPLY:
                return getLeftArgument().evaluate() * getRightArgument().evaluate();
            case DIVIDE:
                return getLeftArgument().evaluate() / getRightArgument().evaluate();
            default:
                throw new IllegalArgumentException("Unknow operator type");
        }
    }

    public InfixOperatorType getType(){
        return type;
    }

    public InfixExpression getLeftArgument(){
        return leftArgument;
    }

    public InfixExpression getRightArgument(){
        return rightArgument;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder("(");
        buffer.append(getLeftArgument());
        switch (getType()) {
            case PLUS: buffer.append("+"); break;
            case MINUS: buffer.append("-"); break;
            case MULTIPLY: buffer.append("*"); break;
            case DIVIDE: buffer.append("/"); break;
            default: throw new IllegalStateException("Unknown operator type");
        }
        buffer.append(getRightArgument()).append(")");
        return buffer.toString();
    }


}
