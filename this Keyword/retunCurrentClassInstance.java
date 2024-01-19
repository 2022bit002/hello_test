//We can return this keyword as an statement from the method. In such case, return type of the method must be the class type (non-primitive).

public class retunCurrentClassInstance {
    retunCurrentClassInstance getA(){  
        return this;  
        }  
        void msg(){System.out.println("Hello java");}  
        }  
        class Test1{  
        public static void main(String args[]){  
        new retunCurrentClassInstance().getA().msg();  
        }  
        }  

