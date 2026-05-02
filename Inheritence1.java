class Car {
    String color;
    String model;
    String brand;
    int mileage;
    int noOfGears;

    public Car(String brand, String color, int mileage, String model, int noOfGears) {
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
        this.model = model;
        this.noOfGears = noOfGears;
    }

    void applyBrake() {
        System.out.println("Brake applied");
    }

    void applySpeed() {
        System.out.println("Speed applied");
    }

    void shiftgear() {
        System.out.println("Gear shifted");
    }
}

// Child class
class Audi extends Car {
    int capacity;

    public Audi(String brand, String color, int mileage, String model, int noOfGears, int capacity) {
        super(brand, color, mileage, model, noOfGears);
        this.capacity = capacity;
    }
}

public class Inheritence1 {
    public static void main(String[] args) {
        Audi a1 = new Audi("Audi", "Red", 15, "A4", 6, 5);

        System.out.println(a1.brand);
        System.out.println(a1.color);
        System.out.println(a1.mileage);
        System.out.println(a1.model);
        System.out.println(a1.noOfGears);
        System.out.println(a1.capacity);
    }
}