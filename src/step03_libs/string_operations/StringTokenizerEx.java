package step03_libs.string_operations;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        // split()
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,");
        System.out.println(Arrays.toString(arr));

        System.out.println();

        //StringTokenizer
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
