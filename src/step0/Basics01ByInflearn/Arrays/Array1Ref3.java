package Basics01ByInflearn.Arrays;

public class Array1Ref3 {
    public static void main(String[] args) {
        //배열 리팩토링: 리팩토링은 코드를 개선하는 것

        int[] students;
        students = new int[]{90, 80, 70, 60, 50};//생성과 초기화 동시에

        //int[] students생략하고 바로 할 수 있음
        // int[] students = {,,,,,}; <-- 이걸로

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생"+(i+1)+"점수: "+students[i]);
        }
    }
}
