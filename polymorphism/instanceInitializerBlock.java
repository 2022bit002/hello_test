package polymorphism;

// it is used to initialize the instance data member

//instance initializer is printed first but constructor invoked eariler than the block.....

class instanceInuinitializerBlock{  
    instanceInuinitializerBlock(){  
    System.out.println("parent class constructor invoked");  
    }  
    }  
    class B2 extends instanceInuinitializerBlock{  
    B2(){  
    super();  
    System.out.println("child class constructor invoked");  
    }  
      
    {System.out.println("instance initializer block is invoked");}  //this how it is declared in the program by the user
      void f(){}
    public static void main(String args[]){  
    B2 b=new B2();  
    b.f();
    }  
    }  