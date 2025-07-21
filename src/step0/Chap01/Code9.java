package Chap01;
import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); //여기서 갯수 정하고~
        int[] data = new int[n];

        for(int i=0; i<n; i++){
            data[i]= kb.nextInt(); //정렬~
        }
        kb.close();// 정렬 끝!

        int temp = data[n-1];
        for(int i=n-2;i>=0;i--){
            data[i+1]=data[i];
        }
        data[0]=temp;

        for(int i=0; i<n; i++) {
            System.out.print(data[i]);
        }
    }
}
