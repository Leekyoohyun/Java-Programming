package Basics01ByInflearn.loop;

public class WhileEx3 {
    public static void main(String[] args) {
        int max = 1;
        for (int i=1; i<=max;i++) {
            int sum = 0;
            while (i <= max) {
                sum = sum + i;
                i++;
            }

            System.out.println(sum);
        }
    }
}
