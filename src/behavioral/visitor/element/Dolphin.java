package behavioral.visitor.element;

import behavioral.visitor.visitor.AnimalOperation;

public class Dolphin implements Animal {

    @Override
    public void accept(AnimalOperation operation) {
        operation.visit(this);
    }
}
