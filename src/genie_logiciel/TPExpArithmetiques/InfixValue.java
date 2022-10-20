package genie_logiciel.TPExpArithmetiques;

public class InfixValue implements InfixExpression {

    private int value;

    public InfixValue(int value) {
        this.value = value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    @Override
    public String toString(){
        return Integer.toString(value);
    }

    @Override
    public int evaluate(){
        return getValue();
    }
}
