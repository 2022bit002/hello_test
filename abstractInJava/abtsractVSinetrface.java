// abstract class  achieves partial abstraction where as interferance achieves fully abtsraciton...


package abstractInJava;

interface A{   //it is by default public , default and abstract
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A{
    public void c(){
        System.out.println("i am c");
    }
}

class C extends B{
    public void a(){
        System.out.println("i am a");
    }
    public void b(){
        System.out.println("i am b");
    }
    public void d(){
        System.out.println("i am d");
    }
}



public class abtsractVSinetrface {
    public static void main(String[] args) {
        A a = new C();
        a.a();a.b();a.c();a.d();
    }
    
}
