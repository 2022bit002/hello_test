public class constructor_Overloading {

    // overtloading means having more than one constructor of same name

    int id;
    int amount;
    String name;
    int q;

    // first constructor
    constructor_Overloading(int a, int b, String c) {

        id = a;
        amount = b;
        name = c;
    }

    // second constructor
    constructor_Overloading(int a, int b, String c, int r) {

        id = a;
        amount = b;
        name = c;
        q = r;
    }

    // display function
    void display() {

        System.out.println("\n" + "Name : " + name + "\n" + "Roll No : " + id + "\n" + "Amount " + amount + "\n"
                + "value of q " + q + "\n");
    }

    public static void main(String[] args) {

        // in both object declaration we have different variable (e.g : c and c1)

        constructor_Overloading c = new constructor_Overloading(2022, 55000, "Pankaj");
        constructor_Overloading c1 = new constructor_Overloading(2023, 60060, "Mayur", 002);

        c.display();
        c1.display();

    }
}