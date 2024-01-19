//here we are passing argument in the method as this which invokes the method

public class thisAsArgument {
    void m(thisAsArgument a){
        System.out.println("This method is invoked");
    }

    void p(){
        m(this);
    }

    public static void main(String[] args) {
        thisAsArgument b = new thisAsArgument();
        b.p();
    }
    
}
