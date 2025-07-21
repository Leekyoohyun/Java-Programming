package Basics01ByInflearn.Input;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a입력 ");
        int a = in.nextInt();

        System.out.print("b입력 ");
        int b = in.nextInt();

        System.out.println("합: "+(a+b));
        if(a>b){
            System.out.println("더 큰 숫자는 "+ a);
        }else if(a< b){
            System.out.println("더 큰 숫자는 "+ b);
        }else{
            System.out.println("두 숫자는 같다. ");
        }
    }
}
