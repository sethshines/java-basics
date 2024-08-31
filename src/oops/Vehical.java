package oops;

public abstract class Vehical {
    private String model;
    private byte noOfGears;
    private byte noOfWheels;
    public int speed;
    void playHorn(){
        System.out.println("Playing Horn");
    }
    abstract void accelerate(int speed);
    void applyBrakes() {
        System.out.println("Applying Brakes");
    }

    void applyBrakes(int speed) {
        System.out.println("Applying Brakes");
    }
}
