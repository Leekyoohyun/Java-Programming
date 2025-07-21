package Chap02;
import java.util.Scanner;

public class Code16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Please enter two integers and press Enter. ");

        int a = in.nextInt();
        int b = in.nextInt();

        int result = power(a,b); // 밑에 만들거임
        System.out.println("The result is "+ result);
        in.close();
    }

    public static int power(int n, int m){ //
        int result = 1;
        for(int i=0; i<m; i++){
            result *=n;

        }
        return result;
    }
}
