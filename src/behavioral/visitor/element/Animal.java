package behavioral.visitor.element;

import behavioral.visitor.visitor.AnimalOperation;

// Element
public interface Animal {
    void accept(AnimalOperation operation);
}
