package encapsulation;

public class AtmMachine {
	
	// THIS IS A SINGLE UNIT
	
	public static void main(String[] args) {
		
		ServerOfBank sob =new ServerOfBank();
		sob.getBalance(1234); //HERE ONLY THE FUNCTIONALITY OF THE METHOD IS VISIBLE I.E. IT ACCEPTS THE PIN BUT THE ACTUAL LOGICS/METHOD USED IN IT ARE NOT VISIBLE THIS IS CALLED AS "ABSTRACTION"
	                         // THIS IS ABSTRACTION	
	
	sob.withdrawl(5000);
	
	sob.getBalance(1234);
	
	
	
	}
	
	
	

}
