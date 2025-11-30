package chap10.section01.example01;

public class SmartTv implements Remote, Searchable{

    @Override
    public void turnOn() {
        System.out.println("TV 켜기");
    }

    @Override
    public void search(String url) {
        System.out.println(url + " 검색");
    }
}
