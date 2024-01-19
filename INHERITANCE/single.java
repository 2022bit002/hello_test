package INHERITANCE;


class marks{
    void maths(){
        float total =67;
        System.out.println(total+"maths");
    }
    void english(){
        float total = 90;
        System.out.println(total+"english");
    }
}

class student extends marks {  //extends keyword is use to inherit the parent class.
    void result (){
        System.out.println("you are passed in maths and english");
    }
}


public class single {
    public static void main(String[] args) {
        student s = new student();
        s.maths();
        s.english();
        s.result();
    }

    
}

