public class obj_initialiseByReferance {
    int id;
    String name;

}

class byInitialiseByreferance {
    public static void main(String args[]) {
        obj_initialiseByReferance s1 = new obj_initialiseByReferance();
        //we can also create multiple objects like s1 and store information   
        s1.id = 2022002;
        s1.name = "Pankaj";
        System.out.println(s1.id + " \n" + s1.name);
    }
}