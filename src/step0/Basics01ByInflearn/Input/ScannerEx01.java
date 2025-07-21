package Basics01ByInflearn.Input;

import java.util.Scanner;

public class ScannerEx01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("당신의 이름은: ");
        String name = in.nextLine();

        System.out.print("당신의 나이는: ");
        int age = in.nextInt();


        System.out.println("당신의 이름은 "+ name+ "이고"+ "당신의 나이는 "+age+"살입니다.");


    }
}
