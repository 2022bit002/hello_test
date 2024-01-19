//using "this" keyword to refer instance variable mainly if instance variable and parameter are same

public class forInstanceVar {
    int id;
    String name ;

    forInstanceVar(int id ,String name){
        this.id = id ;   //here this is use to specify the insatance variable 
        this.name = name ;

    }
    void display(){
        System.out.println(id+" "+name);
    } 

    public static void main(String args[]){
        forInstanceVar f = new forInstanceVar(12,"sggs" );
        f.display();
    }
    
}

// weshould not use this keyword if the instance variable and parameter are different in case for instance variable 
