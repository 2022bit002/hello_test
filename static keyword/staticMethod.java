public class staticMethod {
    static int cube(int x){       //static method to change the value of static variable  
        return x*x*x;  
        }  
        
        public static void main(String args[]){  
        int result=staticMethod.cube(5);  
        System.out.println(result);  
        }  
}

// Java main method is static if it was not static then it must be called by object as static method do not required to call 