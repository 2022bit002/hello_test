public class prime_no {
    public static void main(String args[]) {
        int i, m = 0, n;
        n = 34;
        m = n / 2;
        int flag=0;

        for (i = 2; i <= m; i++) {
            if (n % i == 0) {
                System.out.println(n + " it is not a prime number");
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(n+" it is proime nunmber");
        }
    }

}
