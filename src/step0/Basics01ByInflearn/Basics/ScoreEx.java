package Basics01ByInflearn.Basics;
import java.util.Scanner;
public class ScoreEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int score= in.nextInt();

        if(score>=90){
            System.out.println(score);
            System.out.println("학점: "+"A");
        }else if(score>=80 && score<90){
            System.out.println(score);
            System.out.println("학점: "+ "B");
        }else if(score>=70 && score <80){
            System.out.println(score);
            System.out.println("학점: "+ "C");
        }else if(score>=60 && score<70){
            System.out.println(score);
            System.out.println("학점: "+ "D");
        }else{
            System.out.println(score);
            System.out.println("학점: "+ "F");
        }
    }
}
