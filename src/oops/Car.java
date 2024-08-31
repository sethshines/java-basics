package oops;

public class Car extends Vehical {
    @Override
    void accelerate(int speed) {
        this.speed += speed *2;
    }

    @Override
    void applyBrakes() {
        System.out.println("Apply Brakes !!!!!!!!");
    }

    @Override
    void applyBrakes(int speed) {
        System.out.println("Apply Brakes !!!!!!!!");
    }
}
