package chap17.example06;

public class Button {
    static interface OnClickListener {
        void onClick();              // 추상함수 : {} 없는 함수
    }
    OnClickListener listener;        // 필드
}