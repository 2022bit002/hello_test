//class with abstract key word is called as abstract class
//it is process of hiding the implementation details and showing only the functionality to the user




package abstractInJava;

abstract class bike{
    abstract void run();
}

public class abstractMethod extends bike{
    void run (){
        System.out.println("runnning  smoothly");
    }
    public static void main(String[] args) {
        bike b= new abstractMethod();
        b.run();
    }
    
}
