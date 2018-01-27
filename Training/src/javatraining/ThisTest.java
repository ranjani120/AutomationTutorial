package javatraining;

class Employee
{  
  int id;  
  String name;  
    
  Employee(int id,String name)
 {  
  this.id = id;  
  this.name = name;  
 }  
 void show() 
 {
  System.out.println(id+" "+name);
 } 
}
 class ThisTest{
  public static void main(String args[])
  {  
   Employee e1 = new Employee(111,"Harry");  
   Employee e2 = new Employee(112,"Jacy");  
   e1.show();
   e2.show();
  }  
} 


