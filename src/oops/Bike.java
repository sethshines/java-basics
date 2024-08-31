package oops;

public class Bike extends Vehical{
    @Override
    void accelerate(int speed) {
        this.speed += speed *2;
    }

    void applyBrakes() {
        System.out.println("Apply Brakes !!!!!!!!");
    }
}
