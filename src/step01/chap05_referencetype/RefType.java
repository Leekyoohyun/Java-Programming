package step01.chap05_referencetype;

import java.util.Arrays;

public class RefType {
    public static void main(String[] args) {
        /**
         * 참조타입
         * 객체의 번지를 (메모리 주소를) 참조하는 타입
         * 스택 메모리 영역, heap 메모리 영역
         */
        int age = 29; // 기본 타입
        double price = 100.5;

        String name = "이규현"; // 참조타입
        String hobby = "축구";

        /**
         * age, price는 직접 값을 저장하고 있음.
         * 근데 String 인 name, hobby 는
         * heap 메모리 영역의 String 객체의 번지를 저장하고 있음
         * 포인터 처럼 생각해봐
         */

        String me = "이규현";
        String anotherMe = "이규현12";
        System.out.println(me.equals(anotherMe));
        System.out.println(me == anotherMe); // ? 왜같음?

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = arr2;
        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3); // 같은 번지 참조? 같음
        System.out.println(arr1);
        System.out.println(arr2); // arr1번지수랑 arr2,3 번지수랑 다름. 딴데 참조하는거야
        System.out.println(arr3);

        /**
         * null, NullPointerException
         * 아직 번지를 저장하고 있지 않은 뜻으로 null 값을 가질 수 있음.
         * 스택 영역에 생성까지도 돼.
         */
        String refVar1 = "자바";
        String refVar2 = null;

        System.out.println(refVar1);
        System.out.println(refVar2);

        String exercise = "축구";
        System.out.println(exercise.hashCode());
        exercise = "야구";
        System.out.println(exercise.hashCode());

        String testStr = "abcdefg";
        // System.out.println(testStr[0]); // 이거 안돼.
        System.out.println(testStr.charAt(0));

        System.out.println(testStr.length());
        String newStr = testStr.replace("abc", "ABC");
        System.out.println(newStr);
        String newStr2 = newStr.substring(0,3);
        System.out.println(newStr2);

        int index = newStr2.indexOf("B");
        System.out.println(index);

        String[] arr = testStr.split("");
        System.out.println(Arrays.toString(arr));

        /**
         * Array
         * 배열은 각 값 타입이 같아야함.
         */
        int[] intArr = {1,2,3,4,5,6};
        intArr[0] = 3;
        System.out.println(Arrays.toString(intArr));

        int[][] twoDim = {
                {1,2,3,4,5},
                {6,7,8,9,10}
        };
        for (int a = 0; a < twoDim.length; a++){
            for (int b = 0; b < twoDim[0].length; b++){
                System.out.print(twoDim[a][b]);
            }
            System.out.println();
        }

        String[] oldArray = {"java", "C", "C++"};

        String[] newArray = new String[oldArray.length];

        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);

        for(int i=0; i<oldArray.length; i++){
            System.out.print(oldArray[i]+ " ");
        }

        System.out.println();

        int sum = 0;
        int[] scores = {95, 100, 82, 42, 85};
        for(Integer num : scores){
            sum += num;
        }
        System.out.println(sum/scores.length);
    }
}
