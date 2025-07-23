package step03_generic.generic02;

public class GenericEx {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("삼성 티비");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setModel("SUV");
        product2.setKind(new Car());

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
