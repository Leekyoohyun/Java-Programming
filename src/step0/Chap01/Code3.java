package Chap01;

import java.util.Scanner;
public class Code3 {
    public static void main(String[] args) {
        String str = "h";
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type a string: ");

        input = keyboard.next(); // next 메소드는 하나의 문자열을 읽어줌. 실수를 읽을때는 nextDouble()...등\

        if(str.equals(input)){
            System.out.println("String match! :-)");
        } else{
            System.out.println("String does not match! :-(");
        }
        keyboard.close();
    }
}
