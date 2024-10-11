import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("1. Sepeda / 2. Mobil");
        int pilihan = in.nextInt();

        in.nextLine();

        System.out.println("Jumlah Roda : ");
        int numWheels = in.nextInt();
        System.out.println("Harga : ");
        double price = in.nextDouble();
        in.nextLine();

        if (pilihan == 1) {
            System.out.println("Tipe Sepeda : ");
            String bikeType = in.next();
            Bicycle b1 = new Bicycle(numWheels, price, bikeType);
            b1.print();

            System.out.println("Apakah Ada Diskon? 1. Ya 2. Tidak");
            int jawab = in.nextInt();
            if (jawab == 1) {

            System.out.println("Masukkan Diskon : ");
            double diskonmobil = in.nextDouble();
            double hasilakhirmobil = b1.pakaiDiskon(diskonmobil);
            System.out.println("Harga Setelah Diskon : "+hasilakhirmobil);}
        } else if (pilihan == 2) {
            System.out.println("Convertible? 1. Ya / 2. Tidak");
            int pilih = in.nextInt();
            in.nextLine();
        
        if (pilih == 1) {
            System.out.println("Jumlah Pintu : ");
            int numDoors = in.nextInt();
            System.out.println("Electric : ");
            boolean isElectric = in.nextBoolean();
            System.out.println("Tipe Atap : ");
            String roofType = in.next();
            Convertible c2 = new Convertible(numWheels, price, numDoors, isElectric, roofType);
            c2.print();

            System.out.println("Apakah Ada Diskon? 1. Ya 2. Tidak");
            int jawab = in.nextInt();
            if (jawab == 1) {
            System.out.println("Masukkan Diskon : ");
            double diskonmobil = in.nextDouble();
            double hasilakhirmobil = c2.pakaiDiskon(diskonmobil);
            System.out.println("Harga Setelah Diskon : "+hasilakhirmobil);}
        }else if (pilih == 2 ) {
            System.out.println("Jumlah Pintu : ");
            int numDoors = in.nextInt();
            System.out.println("Electric : ");
            boolean isElectric = in.nextBoolean();
            Car c1 = new Car(numWheels, price, numDoors, isElectric);
            c1.print();

            System.out.println("Apakah Ada Diskon? 1. Ya 2. Tidak");
            int jawab = in.nextInt();
            if (jawab == 1) {
            System.out.println("Masukkan Diskon : ");
            double diskonmobil = in.nextDouble();
            double hasilakhirmobil = c1.pakaiDiskon(diskonmobil);
            System.out.println("Harga Setelah Diskon : "+hasilakhirmobil);}
        }
    }
}
}