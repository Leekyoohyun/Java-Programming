package Basics01ByInflearn.Method;

public class Method1Ref {
    public static void main(String[] args) {
        int sum1 = add(5,10); // 이거 뒤에서 선언함
        System.out.println("결과1 출력: "+ sum1);

        int sum2 = add(15,20);
        System.out.println("결과2 출력: "+sum2);
    }

    public static int add(int a, int b){
        System.out.println(a+"+"+b+"연산수행");
        int sum = a+b;
        return sum; //void가 아니라서 int 값을 리턴해줘야함
    }
}
