package Chap01;
import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) {
        String name = null;
        int age;
        String gender;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please type your name&age&gender: ");
        name = keyboard.next();
        age = keyboard.nextInt();
        gender = keyboard.next();

        if(gender.equals("male")){
            System.out.println(name+", your "+ age + " years old man");
        }else if(gender.equals("female")){
            System.out.println(name+", your "+ age + " years old woman");
        }else{
            System.out.println("Hmm... interesting..");
        }
        keyboard.close();
    }
}
