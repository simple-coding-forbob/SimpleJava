package chap10.section01.quiz01;

public class SmartTv implements Remote, Searchable{

    @Override
    public void turnOff() {
        System.out.println("TV 끄기");
    }

    @Override
    public void volumn(int vol) {
        System.out.println(vol + " 조절");
    }
}
