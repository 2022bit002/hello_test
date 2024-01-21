package polymorphism;

// super keyword to acess the data member or field of parent class 

class animal{

    String color = "red";
}


class dog extends animal{
    String color ="black";

    void print(){
        System.out.println(color);//prints the color of dog class
        System.out.println(super.color);//prints the color of animal class 
    }
}

public class super_instanceVar {
    public static void main(String[] args) {
        dog d = new dog();
        d.print();
    }
    
}
