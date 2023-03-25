package behavioral.visitor.element;

import behavioral.visitor.visitor.AnimalOperation;

public class Lion implements Animal {

    @Override
    public void accept(AnimalOperation operation) {
        operation.visit(this);
    }
}
