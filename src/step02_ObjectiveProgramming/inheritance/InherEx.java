package step02_ObjectiveProgramming.inheritance;

public class InherEx {
    public static void main(String[] args) {
        Child me = new Child("규현", 29);
        System.out.println("자식 나이: "+me.getAge());
        System.out.println("자식 이름: "+me.getFirstName());
        System.out.println("자식 성: "+me.lastName);
        System.out.println("자식 머리색: "+me.hairColor);
    }
}
