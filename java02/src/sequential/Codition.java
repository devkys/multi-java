package sequential;

public class Codition {
	public static void main(String[] args) {
		int jumsu = 88;
		String result = "90";
		
		if(jumsu >= 90) {
			result = "A학점";
		} else if(jumsu >= 70) {
			result  = "B학점";
		} else if(jumsu >= 70) {
			result  = "C학점";
		} else {
			result = "D학점";
		}
		
		System.out.println("당신의 학점은 " + result);
	}

}
