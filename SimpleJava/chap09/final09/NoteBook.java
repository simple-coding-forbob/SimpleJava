package chap09.final09;

public class NoteBook extends Computer{

    @Override
    public void display() {
        System.out.println("NoteBook Display()");
    }

    @Override
    public void typing() {
        System.out.println("NoteBook Typing()");
    }
}
