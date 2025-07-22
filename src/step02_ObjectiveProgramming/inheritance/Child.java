package step02_ObjectiveProgramming.inheritance;

/**
 * 자식 클래스
 * 성, 머리색 받음 부모한테
 */
public class Child extends Parent{
    private String firstName;
    private int age;

    public Child(String firstName, int age){
        super.lastName = getLastName();
        super.hairColor = getHairColor();
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public int getAge(){
        return this.age;
    }
}
