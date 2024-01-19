package polymorphism;


//due to static keyword we do not have to create the instance for calling methods
//here we are using different number of parameter so that we can show overloading

class addition{
    static int  add (int a, int b){
        return a+b;
    }
    static int add (int a, int b, int c){
        return a+b+c;
    }
}

public class method_overloadingByParameter {
    public static void main(String[] args) {
        System.out.println(addition.add(676,765));
    
        System.out.println(addition.add(676,765,357));
 
    }

    
}
