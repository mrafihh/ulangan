public class Car extends Vehicle {
    protected int numDoors;
    protected boolean isElectric;

    public Car() {
        super();
        numDoors = 0;
        isElectric = false;
    }

    // constructor parameter
    public Car(int numWheels, double price, int numDoors, boolean isElectric) {
        super(numWheels, price);
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public void print() {
        System.out.println("================================");
        System.out.println("Jumlah Roda : "+numWheels);
        System.out.println("Harga : "+price);
        System.out.println("Jumlah Pintu : " + numDoors);
        System.out.println(" Electric : " + isElectric);
        System.out.println("================================");
    }
}
