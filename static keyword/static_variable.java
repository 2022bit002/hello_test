// static key word is used for mermory management in java
//it makes program memory efficient 


public class static_variable {

    int id ;
    String name ;
    static String institue = "SGGS";   // static variable are the one how get allocated the memory only once 
    // as collage of all student are same hence no need to allocate the mermory every time .
    void display ()
    {
        System.out.println(id+" "+name+" "+institue);
    }  
    
    public static void main(String[] args) {
        
        static_variable s = new static_variable();

        s.id = 7534;
        s.name = "pankaj";

        s.display();

    }
    
}
