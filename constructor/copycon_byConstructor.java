// copy constructor copy values from one object to another

public class copycon_byConstructor {
    int id;
    String name ;


    // giving values to the data given

    copycon_byConstructor(int a, String b){
        id = a ;
        name = b;
    }

    // constructor to initailise another object

    copycon_byConstructor(copycon_byConstructor c ){
        id = c.id;
        name = c.name;

    }

    void display()
    {
        System.out.println(id+"\n"+name );
    }
    
    public static void main(String[] args) {
        


    copycon_byConstructor c1 = new copycon_byConstructor(1232,"gfgf");
    copycon_byConstructor c2 = new copycon_byConstructor(c1);
   

    c1.display();

    // here we can see we copyied data of one object into another..
    c2.display();
    }

}
