
class account{
    int acc_no ;
    String bank_Name;
    String id;
    float amount;


    //method to insert the information of costumer
    void insert(int a , String name ,String detail, float money)
    {
        acc_no = a;
        bank_Name = name ;
        id = detail ;
        amount = money ;
    }

    //method to deposite ammount
    void deposite(float a){
        amount = amount + a;
        System.out.println(amount + " Deposited in "+id);
        System.out.println(amount+" Bank Balance");
    }

    //method to withdraw money
    void withdraw(float a){
        if (amount > a){
            amount = amount - a ;
            System.out.println(a+ " Withdrawn from "+ id);
            System.out.println(amount+" Bank Balance");
        }
        else{
            System.out.println("Insufficient balance in "+ id);
        }
    }

    //method to display information about the user
    void display(){
        System.out.println("Information  about user  :");
        System.out.println(acc_no+" \n"+bank_Name+" \n"+amount+" \n");
    }

}



public class creating_Bank_System {
    public static void main(String[] args) {
        account A = new account();   //creating an object

        A.insert(80555, "Bank_of_India", "Pankaj", 183786.74f);
        A.deposite(56008.967f);
        A.withdraw(54398.98f);
        A.display();



    }
    
}
