 class instanceVarible_withStatic  {
    static int count=0;//will get memory only once and retain its value  
  
    instanceVarible_withStatic  (){  
count++;//incrementing the value of static variable  
System.out.println(count);  
}  
void display(){}
  
public static void main(String args[]){  
//creating objects  
instanceVarible_withStatic c1=new instanceVarible_withStatic    ();  
instanceVarible_withStatic c2=new instanceVarible_withStatic  ();  
instanceVarible_withStatic   c3=new instanceVarible_withStatic  ();  

c1.display();
c2.display();
c3.display();

}  
}
