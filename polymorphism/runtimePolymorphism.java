// it is a concept by which we can perform a single action in different ways
/*
 * runtime or dynamic method dispatch is a process in which a call to an overridden method is resolved at the time of runtime instead of compiletime....
 * 
 * 
 * upcasting  :  if the referance variable of parent class refers to the object of child class
 * 
 * 
 * 
 */


package polymorphism;

class bike{
    void run(){
        System.out.println("running ");
    }
}

public class runtimePolymorphism extends bike {
    void run(){
        System.out.println("safely running ");
    }

    public static void main(String[] args) {
        bike b = new runtimePolymorphism();  //this is upcasting
        b.run();
    }
    
}
