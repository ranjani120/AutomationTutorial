package javatraining;
interface BankBank{
	int i=8;
	void withdraw();
}
class SbiSbi implements BankBank{
	public void withdraw(){
	System.out.println("In Sbi Class--");
	}
}

public class AbstractionUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SbiSbi b = new SbiSbi();
		b.withdraw();		
		System.out.println(b.i);
		
		/*Bank b1 = new Bank();
		b1.deposit();*/
	}

}
