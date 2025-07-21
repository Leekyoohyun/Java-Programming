package Basics01ByInflearn.Overloading;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: "+add(1,2));
        System.out.println("2: "+add(1,2,3));
    }

    // 첫번째 add 메소드
    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a+b;
    }

    // 두번째 add 메소드
    public static int add(int a, int b, int c){
        System.out.println("2번 호출;;;");
        return a+b+c;
    }
}
