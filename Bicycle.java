public class Bicycle extends Vehicle {
    private String bikeType;

    public Bicycle() {
        super();
        bikeType = "";
    }

    // constructor parameter
    public Bicycle(int numWheels, double price, String bikeType) {
        super(numWheels, price);
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public void print() {
        System.out.println("===============================");
        System.out.println("Jumlah Roda : "+numWheels);
        System.out.println("Harga : "+price);
        System.out.println("Tipe Sepeda : " + bikeType);
        System.out.println("================================");
    }
}
