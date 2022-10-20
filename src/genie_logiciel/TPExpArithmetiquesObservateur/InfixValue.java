package genie_logiciel.TPExpArithmetiquesObservateur;

import java.util.HashSet;
import java.util.Set;

public class InfixValue extends InfixExpressionBase {
    private int value;

    public InfixValue(int value) {
        this.value = value;
    }

    public void setValue(int value){

        this.value = value;
        notifyAllObserver();
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
