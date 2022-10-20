package genie_logiciel.TPExpArithmetiquesObservateur;

public interface InfixExpression {
    int evaluate();
    void addObserver(InfixObserver observer);
    void removeObserver(InfixObserver observer);
}
