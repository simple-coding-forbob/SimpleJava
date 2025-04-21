package chap06.section03.example01;

/**
 * @author simple-coding
 *
 */
public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.powerOn();
        System.out.println(calculator.plus(6, 5)); 
    }
}
