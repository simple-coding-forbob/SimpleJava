package chap12.section01.example02;

public class OutOfBoundApplication {
    public static void main(String[] args) {
    	int[] arr= {1,2};
        System.out.println(arr[5]);  // 에러 발생
    }
}
