//Problem 2 (Classes, Objects, and Aggregation)

public class Car1 {
    private String make;
    private String model;
    private int year;
    private double price;
    private CarOwner1 owner;

    // Default constructor
    public Car1() {
        this.make = "";
        this.model = "";
        this.year = 0;
        this.price = 0.0;
        this.owner = null;
    }

    // Constructor with parameters
    public Car1(String make, String model, int year, double price, CarOwner1 owner) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.owner = owner;
    }

    // Getter and setter methods
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public CarOwner1 getOwner() { return owner; }
    public void setOwner(CarOwner1 owner) { this.owner = owner; }

    @Override
    public String toString() {
        return "Car: " + make + " " + model + " (" + year + ") - $" + price + "\nOwner: " + owner.toString();
    }
}
