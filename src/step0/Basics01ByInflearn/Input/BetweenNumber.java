package Basics01ByInflearn.Input;

import java.util.Scanner;

public class BetweenNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = in.nextInt();

        System.out.print("두번째 숫자를 입력하세요:");
        int num2 = in.nextInt();



        if(num1>num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;

        }

        for(int i=num1; i<=num2 ;i++){
            System.out.print(i);
            if(i != num2){
                System.out.print(", ");
            }

        }

    }
}
