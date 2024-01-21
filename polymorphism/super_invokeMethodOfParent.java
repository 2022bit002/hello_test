package polymorphism;

//  super keyword is use here to invoke the method that has same name in child class and parent class to invoke of parent class

class animal{
    void eat(){
        System.out.println("animal class has waked up");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("the dog is barking");
    }
    void eat(){
        System.out.println("child class is invoked in this method");
    }
    void work(){
        eat();//this invoke the method present in this class by default.
        super.eat();//this will invoke the metjhod of the parent class.

    
}
}

public class super_invokeMethodOfParent {
    public static void main(String[] args) {
        dog d = new dog();
        d.work();
    }
}
