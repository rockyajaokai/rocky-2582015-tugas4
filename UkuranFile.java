import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Konstanta SATU_KB = 1024.0 bertipe double, bukan 1024 (int).
        // Jika pakai 1024, Java melakukan pembagian bilangan bulat (integer division)
        // sehingga pecahan hilang tanpa peringatan. Contoh: 1500 / 1024 = 1 (bukan 1.46...).
        final double SATU_KB = 1024.0;

        // Input nama file
        System.out.print("Nama file     : ");
        String namaFile = input.nextLine();

        // Input ukuran file dalam byte.
        // Ukuran file wajib bertipe long, bukan int.
        System.out.print("Ukuran (byte) : ");
        long ukuranByte = input.nextLong();

        // Konversi dari byte ke KB, MB, GB menggunakan pembagian double (1024.0)
        double ukuranKB = ukuranByte / SATU_KB;
        double ukuranMB = ukuranKB / SATU_KB;
        double ukuranGB = ukuranMB / SATU_KB;

        System.out.println();
        System.out.println("===== UKURAN FILE =====");
        System.out.println(namaFile);
        System.out.println("  " + ukuranByte + " byte");
        System.out.println("  " + ukuranKB + " KB");
        System.out.println("  " + ukuranMB + " MB");
        System.out.println("  " + ukuranGB + " GB");

        input.close();
    }
}