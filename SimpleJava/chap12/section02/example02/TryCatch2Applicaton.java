package chap12.section02.example02;

public class TryCatch2Applicaton {
    public static void main(String[] args) {
//      TODO: 에러(예외) 처리 : try/catch
        try {
            String data = null;
            System.out.println(data.toString()); // 에러
        } catch (Exception e) {
        	System.out.println(e.toString());
            System.out.println("에러가 발생했습니다. 관리자에게 확인하세요");
        }

        try {
        	int[] arr= {1,2};
            System.out.println(arr[5]);  // 에러 발생
        } catch (Exception e) {
        	System.out.println(e.toString());
            System.out.println("에러가 발생했습니다. 관리자에게 확인하세요");
        }
    }
}
