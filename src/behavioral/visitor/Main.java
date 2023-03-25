package behavioral.visitor;

import behavioral.visitor.element.Animal;
import behavioral.visitor.element.Dolphin;
import behavioral.visitor.element.Lion;
import behavioral.visitor.element.Monkey;
import behavioral.visitor.visitor.AnimalOperation;
import behavioral.visitor.visitor.Jump;
import behavioral.visitor.visitor.Speak;

public class Main {
    public static void main(String[] args) {
        Animal monkey = new Monkey();
        Animal lion = new Lion();
        Animal dolphin = new Dolphin();

        AnimalOperation speak = new Speak();
        AnimalOperation jump = new Jump();

        monkey.accept(speak);
        monkey.accept(jump);

        lion.accept(speak);
        lion.accept(jump);

        dolphin.accept(speak);
        dolphin.accept(jump);
    }
}
