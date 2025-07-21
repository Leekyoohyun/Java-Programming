package step01.chap03_operations;

public class Operations {
    public static void main(String[] args) {
        /**
         * 연산자
         *
         */
        //System.out.println(3/0);
        System.out.println(3/0.0); // Infinity 나오네.

        /**
         * 삼항 연산자
         */
        int a = -3;
        String result = (a>0) ? "양수" : "음수";
        System.out.println(result);

        int pivot = 0;
        while(true){
            pivot++;
            if(pivot == 10) break;
            System.out.print(pivot);
        }
        System.out.println();
        System.out.println("break 이후 실행될 문장임");

        // 이중 포문
        Outter: for(int i = 0; i< 10; i++){
            for (int j =0; j<10; j++){
                if(j == 6){
                    break Outter;
                }
                System.out.println(i+""+j);
            }
        }
    }
}
