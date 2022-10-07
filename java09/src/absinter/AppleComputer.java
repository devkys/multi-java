package absinter;

public class AppleComputer implements Computer {

	@Override
	public void set() {
		// TODO Auto-generated method stub
		System.out.println("애플 컴퓨터 세팅");
		
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("애플 컴퓨터 켜기");
		
	}

	@Override
	public void play() {
		System.out.println("애플 컴퓨터로 코딩하기");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("애플 컴퓨터 끄기");
	}

}
