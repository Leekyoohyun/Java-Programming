import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] xs) {
        for(int nextMin = 0;nextMin<xs.length-1;nextMin++){
            int min = nextMin;
            for(int i= nextMin+1; i<xs.length; i++){
                if(xs[i]<xs[min]){
                    min=i;
                }
            }
            swap(xs, nextMin, min);
        }
    }

    public static void swap(int[] xs, int i, int j){
        int temp = xs[i];
        xs[i]=xs[j];
        xs[j]=temp;
    }

    public static void main(String[] args) {
        int[] xs = {9,3,5,6,8,4,1,2};
        sort(xs);
        System.out.println(Arrays.toString(xs));
    }
}
