package chap09.final05;

public class PenguinApplication {
    public static void main(String[] args) {
        Penguin pororo = new Penguin();

        pororo.setName("뽀로로");                   // Setter
        pororo.setHabitat("남극");                  // Setter

        System.out.println(pororo.getName());      // Getter , 뽀로로
        System.out.println(pororo.getHabitat());   // Getter , 남극
    }
}
