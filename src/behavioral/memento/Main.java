package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.type("This is the 1st sentence.");
        editor.type("This is the 2nd sentence.");

        EditorMemento saved = editor.saveState();

        editor.type("And this is the 3rd.");

        System.out.println(editor.getContent());

        editor.restoreState(saved);

        System.out.println(editor.getContent());
    }
}
