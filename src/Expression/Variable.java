package Expression;

import java.util.Objects;

public class Variable extends Expression {
    protected String identifier;

    public Variable(String identifier){
        this.identifier = identifier;
    }

    public String getIdentifier(){
        return identifier;
    }

    @Override
    public String toTreeDiagram() {
        return toString();
    }

    @Override
    public String toString() {
       return identifier;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Variable var && Objects.equals(var.identifier, identifier);
    }
}
