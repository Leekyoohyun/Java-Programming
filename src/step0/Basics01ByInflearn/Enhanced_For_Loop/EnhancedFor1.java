package Basics01ByInflearn.Enhanced_For_Loop;

public class EnhancedFor1 {
    public static void main(String[] args) {
        // for(변수 : 배열 or 컬렉션){...}
        int[] numbers = {1,2,3,4,5};

        //일반 for 문
        for(int i=0; i<numbers.length;i++){
            int number = numbers[i];
            System.out.print(number+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //for-each 아님 향상된 for문
        for(int number : numbers){
            System.out.print(number+" ");
        }
    }
}
