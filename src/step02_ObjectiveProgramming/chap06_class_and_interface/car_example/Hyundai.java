package step02_ObjectiveProgramming.chap06_class_and_interface.car_example;

public class Hyundai {
    public static void main(String[] args) {
        Car avante = new Car("아반테", 0);
        avante.go(60);
        Car grandeur = new Car("그랜져", 0);
        grandeur.go(130);
        avante.stop();
    }
}
