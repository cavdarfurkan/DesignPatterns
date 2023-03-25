package behavioral.visitor.element;

import behavioral.visitor.visitor.AnimalOperation;

public class Monkey implements Animal {

    @Override
    public void accept(AnimalOperation operation) {
        operation.visit(this);
    }
}
