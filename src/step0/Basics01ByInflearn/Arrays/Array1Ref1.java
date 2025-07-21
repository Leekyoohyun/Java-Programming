package Basics01ByInflearn.Arrays;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수선언
        students = new int[5];

        //값 대입
        students[0]=90;
        students[1]=80;
        students[2]=70;
        students[3]=60;
        students[4]=50;

        //값 사용
        System.out.println("점수: "+students[0]);
        System.out.println("점수: "+students[1]);
        System.out.println("점수: "+students[2]);
        System.out.println("점수: "+students[3]);
        System.out.println("점수: "+students[4]);

        //참조값 확인
        System.out.println(students); //[I@7f690630
        // int[] students 라는 변수에 참조값([I@7f690630)를 보관해둔것임. 주소값이라고 생각 ㄱㄱ
    }
}
