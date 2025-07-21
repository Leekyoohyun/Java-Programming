package step01.chap02_var_and_type;

import java.util.Scanner;

public class VariableInitialize {
    public static void main(String[] args) {
        /**
         * 변수 교환
         * temp 왜? -> 메모리 주소니까
         */
        int x = 3;
        int y = 5;
        System.out.println("변경 전 "+"x:"+x +" "+ "y:"+y);

        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("변경 후 "+"x:"+x +" "+ "y:"+y);

        /**
         * 2,8,10,16진수
         */
        int var1 = 0b1011; // 2진수
        int var2 = 0206; // 8진수
        int var3 = 365; // 10진수
        int var4 = 0xB3; // 16진수
        System.out.println("2진수: "+var1);
        System.out.println("8진수: "+var2);
        System.out.println("10진수: "+var3);
        System.out.println("16진수: "+var4);

        /**
         * 문자타입
         * char -> 유니코드
         */
        char c1 = 65;
        char c2 = 'A';
        System.out.println(c1 == c2);

        /**
         * 실수타입
         * float 32bit
         * double 64bit
         */

        /**
         * 논리타입
         * boolean
         */
        boolean stop = true;
        if(stop){
            System.out.println("중지");
        }else{
            System.out.println("시작");
        }

        double a = 3.14;
        int b = (int)a;
        System.out.println(b);

        /**
         * 문자열 -> 정수
         * 정수 -> 문자열
         */
        String str1 = "30000";
        System.out.println(str1+1);
        int val = Integer.parseInt(str1);
        System.out.println(val+1);

        // 반대
        String str2 = String.valueOf(val);
        System.out.println(str2+2);

        // import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.equals("x")) break;
            System.out.println(input);
        }

    }
}
