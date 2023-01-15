import javax.rmi.ssl.SslRMIClientSocketFactory;

public class BooleanTest {

    public static void main(String args[]) {
        boolean b;
        char ch1 = '가';
        char ch2 = '\uac00'; // 가를 나타냄

        b = true;
        System.out.println("b : " + b);
        b = (1 > 2);
        System.out.println("b : " + b);

        System.out.println(ch1);

        System.out.println(ch2);
    }
}
