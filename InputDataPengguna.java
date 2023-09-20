import java.util.Scanner;

public class InputDataPengguna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();
        System.out.print("Masukkan tinggi badan Anda (dalam meter): ");
        double tinggiBadan = input.nextDouble();
        System.out.println("===== Data Anda =====");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " meter");
        input.close();
    }
}
