package javatraining;
abstract class Bank{
	abstract void deposit();
}
class Sbi extends Bank{
	void deposit(){
	System.out.println("In Sbi Class--");
	}
}

public class AbstractionUsingAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi b = new Sbi();
		b.deposit();
		
		/*Bank b1 = new Bank();
		b1.deposit();*/
	}

}
