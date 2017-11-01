/**
 * Created by konglobemeralt on 2017-11-01.
 */
public class CarMain {
    public static void main(String[] args) {
        Car Saab95 = new Saab95();
        Car Volvo240 = new Volvo240();

        System.out.println(Saab95.getCurrentSpeed());
        System.out.println(Saab95.getColor());
        Saab95.incrementSpeed(20);
        System.out.println(Saab95.getCurrentSpeed());

        System.out.println(Volvo240.getCurrentSpeed());
        System.out.println(Volvo240.getColor());
        Volvo240.incrementSpeed(20);
        System.out.println(Volvo240.getCurrentSpeed());

    }
}
