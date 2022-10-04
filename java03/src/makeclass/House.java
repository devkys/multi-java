package makeclass;
import makeclass.Account;


public class House {
    public static void main(String[] args) {
	
	Account ac = new Account();

	ac.name = "hong";
	ac.account = "moneeyyyy";
	ac.money  = 1000;
	
	ac.push();
	ac.out();

    }
}
