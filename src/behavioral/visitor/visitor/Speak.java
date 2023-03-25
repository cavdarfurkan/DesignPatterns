package behavioral.visitor.visitor;

import behavioral.visitor.element.Dolphin;
import behavioral.visitor.element.Lion;
import behavioral.visitor.element.Monkey;

public class Speak implements AnimalOperation {
    @Override
    public void visit(Monkey monkey) {
        System.out.println("Monkey shouts");
    }

    @Override
    public void visit(Lion lion) {
        System.out.println("Lion roars");
    }

    @Override
    public void visit(Dolphin dolphin) {
        System.out.println("Dolphin speaks");
    }
}
