package Basics01ByInflearn.Basics;

public class For2 {

//**문제: i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i ~ endNum 더하기)**
public static void main(String[] args) {
    int i;
    int sum=0;
    int endNum = 4;
    for(i=1; i<=endNum; i++){
        sum = sum +i;
        if(i== endNum){
            System.out.println(sum);
        }
    }

}
}
