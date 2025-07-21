package Chap01;
import java.util.Scanner;
//  사용자로부터 n개의 정수를 입력받고, 정수가 하나씩 입력될 때 마다 현재까지 입력된 정수들을
// 오름차순으로 정렬하는 프로그램

public class Code15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++){
            int temp = in.nextInt();
            int j= i-1;
            while(j>=0 && data[j]> temp){
                data[j+1]= data[j];
                j--;
            }
            data[j+1]=temp;

            for(int k=0; k<=i; k++){
                System.out.print(data[k]+" ");
            }
            System.out.println();
        }
        in.close();

    }
}
