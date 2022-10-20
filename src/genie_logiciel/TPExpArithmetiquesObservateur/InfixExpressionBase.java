package genie_logiciel.TPExpArithmetiquesObservateur;

import java.util.HashSet;
import java.util.Set;

public abstract class InfixExpressionBase implements InfixExpression {
    private final Set<InfixObserver> observerSet = new HashSet<>();

    @Override
    public int evaluate() {
        return 0;
    }

    @Override
    public void addObserver(InfixObserver observer){
        observerSet.add(observer);
    }

    @Override
    public void removeObserver(InfixObserver observer){
        observerSet.remove(observer);
    }

    protected void notifyAllObserver(){
        for (InfixObserver observer : observerSet){
            observer.notify(this);
        }
    }
}
