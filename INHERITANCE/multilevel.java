package INHERITANCE;

//  htis is an example of muktilevel inheritance 

class grandparent{  // first level of inheritance 
    void garnd(){
        System.out.println("hi i am the grandparent");
    }
}

class parent extends grandparent{   // first level of inheritance 
    void prnt(){
        System.out.println("hi i ma the parent");
    }
}

class child extends parent {      // second level of inheritance 
    void boy(){
        System.out.println("hi i am the child");
    }
}
public class multilevel {
    public static void main(String[] args) {
        child c = new child();
        c.garnd();;
        c.prnt();
        c.boy();
        
        
    }
    
}
