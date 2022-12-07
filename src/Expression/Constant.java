package Expression;

public class Constant extends Expression {
    protected double value;

    public Constant(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toTreeDiagram() {
        return toString();
    }
    @Override
    public String toString() {
        return String.valueOf(value);
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Constant c && c.value == value;
    }
}
