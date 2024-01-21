//it is a type of the object determined at compiletime
//if there is any private,final,static method in a class there is static binding 

package polymorphism;

public class staticBinding {
    private void eat(){
        System.out.println("dog is eating...");
    }  
  
public static void main(String args[]){  
 staticBinding d1=new staticBinding();  
 d1.eat();  
}  

    
}
