import java.util.Scanner;

public class inputanData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Kamu: ");
        String nama = input.nextLine();
        System.out.println("Masukkan usia: ");
        int usia = input.nextInt();

        System.out.println("===");
        System.out.println("hai "+nama+", usia kamu "+usia);
    }
}
