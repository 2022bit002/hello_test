//  this() can be use to invoke an constructor in current class

//calling default constructor from parameterized constructor.
//similarly we can also call parameterized constructor from default


//constructor call should be used to reuse the constructor fronm the constructor


public class invokingConstructor {
    invokingConstructor(){System.out.println("hello a");}  
invokingConstructor(int x){  
this();  
System.out.println(x);  
}  
void display(){};
}  
class TestThis5{  
public static void main(String args[]){  
invokingConstructor a=new invokingConstructor(10);  
a.display();
}
}
