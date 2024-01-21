//if a class implements multiple interface or an interface extends multiple interface it is called the multiple inheritance...

// multiple inheritance id supporteed by interface as there is no ambiguity because its implementation is provided by the implementation class..




package abstractInJava;

interface printable {
    void print();
}


interface showable{
    void show();
}


public class multipleInheritanceByInterface implements printable,showable{
    public void print(){
        System.out.println("hello");
    }

    public void show(){
        System.out.println("world");
    }

    public static void main(String[] args) {
        multipleInheritanceByInterface m = new multipleInheritanceByInterface();
        m.print();
        m.show();
    }
    
}
