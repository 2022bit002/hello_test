public class basic {
    public static void main (String args[])
    {
        short a=50;
        short b=80;
        a+=b;//this is fine.
        a = (short)(a + b);//it creates the type casting issue.
        System.out.println(a);
    }
}    
