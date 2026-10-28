import java.util.Scanner;

public class Tugas307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko = ");
        int toko = sc.nextInt();

        int totalSemua = 0;
        int barangTerbanyak = -1;
        int nomorToko = 0;

        for (int i = 1; i <= toko; i++) {
            System.out.print("Masukkan jumlah pelanggan toko " + i + " = ");
            int pelanggan = sc.nextInt();

            int totalBarang = 0;

            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("Jumlah barang pelanggan " + j + " = ");
                int barang = sc.nextInt();

                totalBarang = totalBarang + barang;
            }

            System.out.println("Toko " + i + " - pelanggan: " + pelanggan
                    + ", total barang: " + totalBarang);

            totalSemua = totalSemua + totalBarang;

            if (totalBarang > barangTerbanyak) {
                barangTerbanyak = totalBarang;
                nomorToko = i;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalSemua);
        System.out.println("Toko dengan barang terbanyak: " + nomorToko);

        sc.close();
    }
}
