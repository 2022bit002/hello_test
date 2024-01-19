

public class instanceVariable_withoutstatic {
    int count=0;//will get memory each time when the instance is created  
  
    instanceVariable_withoutstatic(){  
count++;//incrementing value  
System.out.println(count);  
}  
void display(){
}
  
public static void main(String args[]){  
//Creating objects  
instanceVariable_withoutstatic c1=new instanceVariable_withoutstatic();  
instanceVariable_withoutstatic c2=new instanceVariable_withoutstatic();  
instanceVariable_withoutstatic c3=new instanceVariable_withoutstatic();  
c1.display();
c2.display();
c3.display();
}  
}
