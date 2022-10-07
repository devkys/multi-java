package absinter;

public class UseComputer {
	public static void main(String[] args) {
		AppleComputer ap = new AppleComputer();
		BananaComputer bn = new BananaComputer();
		
		ap.set();
		ap.on();
		ap.play();
		ap.off();
		
		bn.set();
		bn.on();
		bn.play();
		bn.off();
	}
}
