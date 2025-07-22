package step03_libs.string_operations;

/**
 * 박싱 언박싱
 */
public class BoxingUnBoxing {
    public static void main(String[] args) {
        //Boxing
        Integer obj = 100;
        System.out.println("boxingVal: "+obj.intValue());

        //Unboxing
        int value = obj;
        System.out.println("unboxingVal: "+value);
    }
}
