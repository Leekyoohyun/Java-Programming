package step02_ObjectiveProgramming.chap06_class_and_interface.car_example;

public class Ferrari {
    public static void main(String[] args) {
        Car f40 = new Car("F40", 0);
        f40.go(150);
        f40.stop();
        System.out.println(f40.getCarName());
    }
}
