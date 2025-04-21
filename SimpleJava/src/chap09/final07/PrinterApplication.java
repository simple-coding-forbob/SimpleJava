package chap09.final07;

public class PrinterApplication {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.powerOn();       // "전원켜기" 
        printer.print();         // "기본 프린터 입니다. 기본사양으로 프린팅합니다." 

        LaserPrinter laserPrinter = new LaserPrinter();
        laserPrinter.print();     // "레이저프린터로 프린트합니다. 고급 사양으로 프린팅합니다." 
        laserPrinter.powerOff();  // "전원끄기" 
    }
}
