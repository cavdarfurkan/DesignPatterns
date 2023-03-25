package behavioral.visitor.visitor;

import behavioral.visitor.element.Dolphin;
import behavioral.visitor.element.Lion;
import behavioral.visitor.element.Monkey;

// Visitor
public interface AnimalOperation {
    void visit(Monkey monkey);
    void visit(Lion lion);
    void visit(Dolphin dolphin);
}
