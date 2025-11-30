package chap18.example03;

public class Calculator {
    private int memory;

    public synchronized void setMemory(int memory) {
        try {
            this.memory = memory;
            Thread.sleep(1000);  // 1초 지연 (예외처리 필요)
            System.out.println(this.memory);
        } catch (Exception e) {}
    }
}
