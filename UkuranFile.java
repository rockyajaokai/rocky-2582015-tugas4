import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nama file
        System.out.print("Nama file     : ");
        String namaFile = input.nextLine();

        // Input ukuran file dalam byte.
        // Ukuran file wajib bertipe long bukan int.
        System.out.print("Ukuran (byte) : ");
        long ukuranByte = input.nextLong();

        System.out.println();
        System.out.println("===== UKURAN FILE =====");
        System.out.println(namaFile);
        System.out.println("  " + ukuranByte + " byte");

        input.close();
    }
}