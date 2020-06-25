package pkg1b;
public class Car {
    private int model;
    private String make;
    private int speed;

    Car(){}

    Car(int model, String make, int speed){
        this.model = model;
        this.make = make;
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }
    public int getModel() {
        return model;
    }
    public int getSpeed() {
        return speed;
    }

    public void accelerate(){
        this.speed+=5;
    }

    public void brake(){
        this.speed-=5;
    }

}

class Driver{
    public static void main(String[] args) {
        Car toyota = new Car(2020,"TOYOTA",50);
        System.out.println("INITIAL TOYOTA SPEED = 50");

        System.out.println("ACCELEARTING TOYOTA");

        for(int i=0;i<5;i++){
            toyota.accelerate();
            System.out.println("TOYOTA's SPEED = " + toyota.getSpeed());
        }

        System.out.println("BRAKING TOYOTA");

        for(int i=0;i<5;i++){
            toyota.brake();
            System.out.println("TOYOTA's SPEED = " + toyota.getSpeed());
        }
    }
}