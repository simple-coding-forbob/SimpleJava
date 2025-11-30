package chap10.section01.example01;

public class SmartApplication {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        Remote remoteControl = smartTv;
        Searchable searchable = smartTv;

        remoteControl.turnOn();               // tv 켜기
        searchable.search("www.naver.com");   // 인터넷 검색 기능
    }
}
