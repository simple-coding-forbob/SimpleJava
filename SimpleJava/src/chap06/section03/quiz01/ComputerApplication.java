package chap06.section03.quiz01;

/**
 * @author simple-coding
 *
 */
public class ComputerApplication {
    public static void main(String[] args) {
        Computer computer = new Computer();
    
        System.out.println(computer.minus(6, 5)); 
        computer.powerOff();
    }
}
