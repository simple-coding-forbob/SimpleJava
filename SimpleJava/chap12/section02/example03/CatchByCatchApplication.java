package chap12.section02.example03;

public class CatchByCatchApplication {
    public static void main(String[] args) {
        try {
            String data = null;                  // 아무것도 없는 값
            System.out.println(data.toString()); // 에러(예외) 발생
            
        	int[] arr= {1,2};
            System.out.println(arr[5]);  // 에러 발생
        } catch (NullPointerException e) {
            System.out.println("변수에 null 값을 넣었습니다.");
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } catch (Exception e) {
            System.out.println("에러가 발생했습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다");
        }
    }
}
