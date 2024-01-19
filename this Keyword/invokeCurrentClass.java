//tis can be used to invoke the current class if we dont add compiler by default add this keyword

public class invokeCurrentClass {

    void m(){System.out.println("hello m");}  
void n(){  
System.out.println("hello n");  
//m();//same as this.m()  
this.m();  //if we dont add compiler add it by default
}  
}  
class TestThis4{  
public static void main(String args[]){  
invokeCurrentClass a=new invokeCurrentClass();  
a.n();  
}
}
