package Chap01;

public class Code2 {
    public static void main(String[] args) {
        // in C, int grades[5]; 배열의 크기를 정해줌

        // in java,
        int[] grades; // grades라는 배열을 만들겠다는 just 의사표현
        grades = new int[5];

        // 값 넣기
        grades[0]=100;
        grades[1]=200;
        grades[2]=300;
        grades[3]=400;
        grades[4]=500;

        //출력하기
        for(int i=0; i<grades.length ;i++){
            System.out.println(grades[i]);
        }

    }
}
