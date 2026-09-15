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
        // Wajib tipe long karena angka besar seperti 3.221.225.472 melewati batas int (maks 2.147.483.647).
        // Jika pakai int, terjadi overflow dan nilai menjadi negatif (contoh: 3221225472 -> -1073741824).
        System.out.print("Ukuran (byte) : ");
        long ukuranByte = input.nextLong();

        // Konversi dari byte ke KB, MB, GB menggunakan pembagian double (1024.0)
        double ukuranKB = ukuranByte / SATU_KB;
        double ukuranMB = ukuranKB / SATU_KB;
        double ukuranGB = ukuranMB / SATU_KB;

        // Konversi double ke int secara eksplisit menggunakan casting (int).
        // Bagian desimal hilang tanpa pembulatan (truncation), bukan pembulatan ke terdekat.
        // Contoh: 3072.9 -> 3072 (bukan 3073), karena (int) memotong desimal.
        int ukuranMBBulat = (int) ukuranMB;
        double selisih = ukuranMB - ukuranMBBulat;

        // Tampilkan hasil
        System.out.println();
        System.out.println("===== UKURAN FILE =====");
        System.out.println(namaFile);
        System.out.println("  " + ukuranByte + " byte");
        System.out.println("  " + ukuranKB + " KB");
        System.out.println("  " + ukuranMB + " MB");
        System.out.println("  " + ukuranGB + " GB");
        System.out.println();
        System.out.println("Dibulatkan ke MB  : " + ukuranMBBulat);
        System.out.println("Selisih pembulatan: " + selisih);

        input.close();
    }
}