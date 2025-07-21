package Basics01ByInflearn.Input;

import java.util.Scanner;

public class NestedInputEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("구구단 정보가 필요한 정수: ");
        int n = in.nextInt();
        System.out.println(n+"의 구구단: ");
        for(int i=1; i<10;i++){
            System.out.println(n+" * "+i+"= "+(n*i));
        }
    }
}
