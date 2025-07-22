package step02_ObjectiveProgramming.chap06_class_and_interface.car_example;

/**
 * Car 클래스
 * go, stop : method
 * 속도v, name: field
 */
public class Car {
    private String carName;
    private int velocity;

    // 필드값 초기화(받을 때)
    public Car(String name, int v){
        this.carName = name;
        this.velocity = v;
    }

    public void go(int v){
        this.velocity += v;
        System.out.println(this.carName+" 가 "+this.velocity+"km/h 로달립니다.");

    }

    public void stop(){
        this.velocity = 0;
        System.out.println(this.carName + "가 멈춥니다.");
    }
}
