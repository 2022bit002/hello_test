//copy by assigning the objects values to another object. 

public class copycon_byObject {
    int id;
    String name ;

    copycon_byObject(int a, String b){
        id = a ;
        name = b ;
    }

    copycon_byObject(){};  //created an class which will be asssigned values of the another object

    void display(){
        System.out.println(id+" "+name);
    } 


    public static void main(String[] args) {
        
        copycon_byObject c1 = new copycon_byObject(234,"uydu") ;

        //  allocating space to another object

        copycon_byObject  c2 = new copycon_byObject();

        //assigning the object values to another object.

        c2.id = c1.id ;
        c2.name = c1.name ;

        c1.display();
        c2.display();
          



    }


}
