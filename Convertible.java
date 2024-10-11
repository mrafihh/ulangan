public class Convertible extends Car {
    private String roofType;

    public Convertible() {
    super();
    roofType = "";
    }

    public Convertible(int numWheels, double price, int numDoors, boolean isElectric, String roofType) {
        super(numWheels, price, numDoors, isElectric);
        this.roofType = roofType;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public void print() {
        System.out.println("================================");
        System.out.println("Jumlah Roda : "+numWheels);
        System.out.println("Harga : "+price);
        System.out.println("Jumlah Pintu : " + numDoors);
        System.out.println(" Electric : " + isElectric);
        System.out.println("Roof Type : " + roofType);
        System.out.println("================================");
    }
}
