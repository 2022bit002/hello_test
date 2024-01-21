//  when the type of object is determined at run time it is known as dynamic binding.. 


package polymorphism;

class animal{  
    void eat(){System.out.println("animal is eating...");}  
   }  

public class dynamicBinding extends animal{
    void eat(){ 
        System.out.println("dog is eating...");
    }  
  
 public static void main(String args[]){  
  animal a=new dynamicBinding();  //upcasting persent in  polymorphism
  a.eat();  
 }  
}
