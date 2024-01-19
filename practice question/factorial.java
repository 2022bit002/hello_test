public class factorial{
    public static void main(String[] args) {
        int i,a,b;
        a=6; b=1;
        for(i=1;i<=a;i++){
           
            b*=i;
        }
        System.out.println(b+" is factorial of "+a);
    }
    
}
