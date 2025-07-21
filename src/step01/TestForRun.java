package step01;

import java.util.Arrays;

public class TestForRun {
    public static void main(String[] args) {
        // lets git test gogo
        int a = 0;
        System.out.println(a);
        int[] arrInt = new int[5];
        for(int i=0; i<arrInt.length; i++){
            arrInt[i] = (i+1)*(i+1); // 제곱
        }
        System.out.println(Arrays.toString(arrInt));
    }
}
