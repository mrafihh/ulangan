public class Vehicle {
    protected int numWheels;
    protected double price;

    public Vehicle() {
        numWheels = 0;
        price = 0.00;
    }

    // constructor parameter
    public Vehicle(int numWheels, double price) {
        this.numWheels = numWheels;
        this.price = price;
    }

    public double pakaiDiskon(double persenatseDiskon){
        return price - (price * persenatseDiskon
         / 100);
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.println("Jumlah roda : " + numWheels);
        System.out.println("Harga : " + price);
    }
}
