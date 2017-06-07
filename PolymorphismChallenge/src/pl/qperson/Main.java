package pl.qperson;

class Car {

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(String name, int cylinders) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {

        System.out.println("Car " + getName() + " engine started");

    }
}

class Fiat extends Car {

    public Fiat(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " " + this.getName() + " engine started");
    }
}

class Mazda extends Car {

    public Mazda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Mazda " + this.getName() + " engine started");
    }
}



public class Main {

    public static void main(String[] args) {

        Car car = new Car("Wozidło",4);
        car.startEngine();

        Fiat fiat = new Fiat("126p",2);
        fiat.startEngine();

        Mazda mazda = new Mazda("323F",4);
        mazda.startEngine();

    }
}
