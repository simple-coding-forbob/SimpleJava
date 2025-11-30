package chap14.section03.example01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysApplication {
    public static void main(String[] args) {
//        TODO:
        int[] arr    = {0,1,2};             // 배열(1개짜리: 1차원배열)
        int[][] arr2 = {{10,11},{20,21}}; //배열(2개짜리: 2차원배열)

//      TODO: 1) 1차원 배열값 출력
//        사용법 : Arrays.toString(배열)
        System.out.println(Arrays.toString(arr)); // [0, 1, 2]

//      TODO: 2) 2차원 배열값 출력
//        사용법 : Arrays.deepToString(배열)
        System.out.println(Arrays.deepToString(arr2)); // [[10, 11], [20, 21]]

//        TODO: 3) 특정 값으로 배열 채우기
//          사용법 : Arrays.fill(배열, 특정값)
        int[] arr3 = new int[3]; // 기본 : 0 으로 채워짐
        Arrays.fill(arr3, 9); // []
        System.out.println(Arrays.toString(arr3)); // [9, 9, 9]

//        TODO: 4) 내림차순/오름차순 정렬 (퀵정렬)
//          정렬문제 : 실버급 문제들
//          참고) 정렬 알고리즘 : 이진정렬 == 삽입정렬 < 힙정렬 ==퀵정렬 ... (속도값)
//               퀵정렬 단점 : 값이 미리 정렬되어 있으면 굉장히 느림 예) {1,2,3}
//          사용법 :
//            (1) 내림차순 : Arrays.sort(배열, Collections.reverseOrder())
//            => char -> Character
        Character[] chArr = {'A', 'C', 'B'};
        Arrays.sort(chArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(chArr)); // [C, B, A]
//        TODO: 
//            (2) 오름차순 : Arrays.sort(배열)
        Arrays.sort(chArr);
        System.out.println(Arrays.toString(chArr)); // [A, B, C]
    }
}


















