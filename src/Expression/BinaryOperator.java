package Expression;

public class BinaryOperator extends Expression{
    protected BinaryOperation type;
    protected Expression operandA;
    protected Expression operandB;

    public BinaryOperator(BinaryOperation type){
        this.type = type;
    }
    public BinaryOperator(BinaryOperation type, Expression operandA, Expression operandB){
        this.type = type;
        this.operandA = operandA;
        this.operandB = operandB;
    }
    @Override
    public String toTreeDiagram() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public String toString() {
        return null;
    }
}
