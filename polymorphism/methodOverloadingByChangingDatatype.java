package polymorphism;
 
//here we are changing the data type of the method which result in method overloading

class addition{
    static int  add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
}


public class methodOverloadingByChangingDatatype {
    

    public static void main(String[] args) {
        System.out.println(addition.add(676,765));
    
        System.out.println(addition.add(666,76));
 
    }

}
