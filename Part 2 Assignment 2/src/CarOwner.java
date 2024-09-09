public class CarOwner {
    private String name;
    private String address;

    // Default constructor
    public CarOwner() {
        this.name = "";
        this.address = "";
    }

    // Constructor with parameters
    public CarOwner(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter and setter methods
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return name + ", " + address;
    }
}
