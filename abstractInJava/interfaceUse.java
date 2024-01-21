//interface in java is a blue print of a class it has a static costants and abstract methods

/*
 * use for 
 * 1 achieve abstaction 
 * 2 support functionality of multiple inheritance
 * 3 achieve coupling
 */

package abstractInJava;


  //  interface key word is use to declare the interface

  //interface fields are public , static and final by default and methods are public and abstract


interface printable{
    void print();
}


public class interfaceUse implements printable{  // an class implements the interface and interface extands the interface..

    
   public void print(){
        System.out.println("hi to interface");
    }
    
    public static void main(String[] args) {
        interfaceUse b = new interfaceUse();
        b.print();
    }
}
