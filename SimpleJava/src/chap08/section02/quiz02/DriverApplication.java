package chap08.section02.quiz02;

public class DriverApplication {
	
	public static void drive(Airplane airplane) {
		airplane.fly();
	}
	
    public static void main(String[] args) {

        KoreaAir koreaAir   = new KoreaAir();
        AsianaAir asianaAir = new AsianaAir();

        drive(koreaAir);    
        drive(asianaAir);
    }
}
