package javatraining;

class Encap{
	private String max;
	public String getValue(){
		return max;
	}
	public void setValue(String maxValue){
		max = maxValue;
	}
	}
public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap e = new Encap();
		e.setValue("Testing Encapsulation");
		System.out.println(e.getValue());
		
	}

}
