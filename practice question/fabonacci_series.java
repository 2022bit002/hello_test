public class fabonacci_series {

    public static void main(String args[]){

        int a,b,c,i;
        a=0;b=1;
        int no=12;
        System.out.print(a+" "+b);
        for(i=2;i<no;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
    
}
