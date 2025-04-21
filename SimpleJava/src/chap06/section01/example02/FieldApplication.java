package chap06.section01.example02;

public class FieldApplication {
	public static void main(String[] args) {
      FieldInit fieldInit = new FieldInit();

//    TODO: 속성(필드) 출력 : 정수초기화 : 값 : 0
      System.out.println(fieldInit.byteVal);
      System.out.println(fieldInit.shortVal);
      System.out.println(fieldInit.intVal);
      System.out.println(fieldInit.longVal);

//    TODO: 참/거짓 : 초기값(false), char : \u0000(화면에 보이지않음)
      System.out.println(fieldInit.booleanVal);
      System.out.println(fieldInit.charVal);

//    TODO: 실수 : 0.0 / 배열 : 초기값(null) / 문자열 : 초기값(null)
      System.out.println(fieldInit.floatVal);
      System.out.println(fieldInit.doubleVal);
      System.out.println(fieldInit.arrayVal);
      System.out.println(fieldInit.stringVal);		
	}
}
