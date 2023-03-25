package behavioral.visitor.visitor;

import behavioral.visitor.element.Dolphin;
import behavioral.visitor.element.Lion;
import behavioral.visitor.element.Monkey;

public class Jump implements AnimalOperation {
    @Override
    public void visit(Monkey monkey) {
        System.out.println("Monkey jumps");
    }

    @Override
    public void visit(Lion lion) {
        System.out.println("Lion jumps");
    }

    @Override
    public void visit(Dolphin dolphin) {
        System.out.println("Dolphin jumps");
    }
}
