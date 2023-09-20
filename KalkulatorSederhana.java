import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        int hasilPenjumlahan = angka1 + angka2;
        int hasilPengurangan = angka1 - angka2;
        int hasilPerkalian = angka1 * angka2;
        double hasilPembagian = 0.0;
        if (angka2 != 0) {
            hasilPembagian = (double) angka1 / angka2;
        }
        System.out.println("===== Hasil Operasi =====");
        System.out.println("Penjumlahan: " + angka1 + " + " + angka2 + " = " + hasilPenjumlahan);
        System.out.println("Pengurangan: " + angka1 + " - " + angka2 + " = " + hasilPengurangan);
        System.out.println("Perkalian: " + angka1 + " * " + angka2 + " = " + hasilPerkalian);
        System.out.println("Pembagian: " + angka1 + " / " + angka2 + " = " + hasilPembagian);
        input.close();
    }
}
