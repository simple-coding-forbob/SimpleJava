package chap06.section04.example01;


public class CalculatorApplication {
    public static void main(String[] args) {

        double result = 10 * 10 * Calculator.pi;
        int result2   = Calculator.plus(10, 5);

        System.out.println(result);
        System.out.println(result2);
    }
}
