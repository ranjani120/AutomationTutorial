package javatraining;

import java.io.*;

class SumOfNumbers{
      
    // adding two integer values.
    public void add(int a, int b){
          
        int c = a+b;        
        System.out.println("In Parent Class--"+c);
    }
     
}
class SumOfNumber2 extends SumOfNumbers{
	public void add(int a, int b){
        
        int c = a+b;       
        System.out.println("In Child Class--"+c);
    }
}
public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SumOfNumbers obj1 = new SumOfNumbers();
		SumOfNumbers obj2 = new SumOfNumber2();
		SumOfNumber2 obj3 = new SumOfNumber2();
		
        
        obj1.add(1,2);
        
        obj2.add(2,2);
        obj3.add(2,2);*/
        
        Double object = new Double("2.4");
        int a = object.intValue();
        byte b = object.byteValue();
        float d = object.floatValue();
        double c = object.doubleValue();
 
        System.out.println(a + b + c + d );
       
	}

}
