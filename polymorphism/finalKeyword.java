// final keyword is use to restrict the user
/*
 * it stop value from changing, stop method overridding , stop inheritance..
 * 
 * final variable that donot have value it is called as blank or uninitialized final variable it can be initialized only by constructor..
 * 
 * final keyword can be used with 
 * 1 variable
 * 2 method
 * 3 class
 * 
 */



package polymorphism;

class Bike9{
    final int speedlimit=90;//final variable  
    void run(){  
     //speedlimit=400;  //this will produce error in the code 
     System.out.println(speedlimit);
    }  
}

public class finalKeyword {
  
 public static void main(String args[]){  
 Bike9 obj=new  Bike9();  
 obj.run();  
 }  
    
}
