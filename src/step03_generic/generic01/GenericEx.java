package step03_generic.generic01;

/**
 * 제네릭 예제
 */
public class GenericEx {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요?";

        Box<Integer> box2 = new Box<>();
        box2.content = 100;

        String str = box1.content;
        System.out.println(str);

        int value = box2.content;
        System.out.println(value);
    }
}
