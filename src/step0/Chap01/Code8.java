package Chap01;

import java.util.Scanner;

public class Code8 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n]; // n을 입력 받을거임!!

        for(int i=0; i<n; i++)
            data[i]= kb.nextInt();
        kb.close();

        int sum=0;
        int max= 0;

        for(int i=0; i<n; i++){
            sum += data[i]; // sum = sum+ data[i];
            if(data[i]>max)
                max= data[i];
        }
        System.out.println("Sum is "+ sum + "and the maximum is "+max);
    }


}
