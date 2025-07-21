package Chap02;

import java.util.Scanner;

public class Code18_2 {
    public static void main(String[] args) {
        // Code18과 같은데
        // swap 메소드를 만들어서 swap 하게 만듬
        // Code14이랑 같은데 bubbleSort(); 메소드를 만들어서 하게 만드는 것이 다름
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++){
            data[i]= kb.nextInt();
        }
        kb.close();

        bubbleSort(n, data);

        //bubble sort

        System.out.println("Sorted data");
        for(int i=0; i<n; i++){
            System.out.println(data[i]+ " ");
        }
    }

    static void bubbleSort(int n, int[] data){
        // 아무것도 리턴할 필요가 없기 때문에 void
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(data[j]>data[j+1]){
                    // swap data[j] and data[j+1]
                    swap(data[j], data[j+1]);
                }
            }
        }
    }

    static void swap(int a, int b){
        int tmp= a;
        a= b;
        b= tmp;
        // 두 값만 바꾸면 되기 때문에 리턴할 게 없음
    }
}
