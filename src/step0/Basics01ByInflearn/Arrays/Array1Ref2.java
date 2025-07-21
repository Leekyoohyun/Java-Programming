package Basics01ByInflearn.Arrays;

public class Array1Ref2 {
    public static void main(String[] args) {
        //배열 리팩토링: 리팩토링은 코드를 개선하는 것
        int[] students;
        students = new int[5];

        //값 대입
        students[0]=90;
        students[1]=80;
        students[2]=70;
        students[3]=60;
        students[4]=50;
        //값 사용
        for(int i=0; i<students.length;i++){
            System.out.println("학생"+(i+1)+"점수: "+students[i]);
        }
    }
}
