package behavioral.memento;

public class Editor {

    private String content = "";

    public void type(String words) {
        this.content += words + " ";
    }

    public String getContent() {
        return this.content;
    }

    public EditorMemento saveState() {
        return new EditorMemento(this.content);
    }

    public void restoreState(EditorMemento memento) {
        this.content = memento.getContent();
    }
}
