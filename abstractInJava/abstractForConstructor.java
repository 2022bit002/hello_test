//  if the abstarctor method is in class then class must be abstract class..

package abstractInJava;

abstract class bike{
    bike(){
        System.out.println("bike is created");
    }
    abstract void run();
    void changegear(){
        System.out.println("change the gear");
    }
}


class honda extends bike{
    void run(){
        System.out.println("running safely..");
    }
}

public class abstractForConstructor {
    public static void main(String[] args) {
        bike b = new honda();
        b.run();
        b.changegear();
    }
    
}
