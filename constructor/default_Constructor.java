public class default_Constructor {
    //default constructor is by default present if not given by the user.
    default_Constructor(){
        System.out.println("hey I am a default constructor");
    }

    void display(){
        System.out.println("greate to see it");
    }
        public static void main(String args[]){
            default_Constructor c = new default_Constructor();
            c.display();
        }
 }
    

