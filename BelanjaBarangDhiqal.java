import java.util.Scanner;

public class BelanjaBarangDhiqal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Barang");
        String namaBarang = input.nextLine();
        System.out.println("Masukkan Harga");
        double harga=input.nextDouble();

       System.out.println("Nama Barang"+namaBarang);
       System.out.println("Harga Baranng "+harga);

        input = new Scanner(System.in);
        System.out.println("Masukkan Nama Barang");
        namaBarang = input.nextLine();
        System.out.println("Masukkan Harga");
        harga=input.nextDouble();

       System.out.println("==============");
       System.out.println("Nama Barang"+namaBarang);
       System.out.println("Harga Baranng"+harga);


        

    }
}
