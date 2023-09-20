import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            int jumlah = 0;
            int count = 0;

            System.out.println("Masukkan serangkaian angka (0 untuk menghitung rata-rata):");
            
            while (true) {
                try {
                    int angka = input.nextInt();

                    if (angka == 0) {
                        break;
                    }

                    jumlah += angka;
                    count++;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Input tidak valid. Masukkan angka bulat.");
                    input.next(); 
                }
            }

            if (count == 0) {
                System.out.println("Tidak ada angka yang dimasukkan.");
            } else {
                double rataRata = (double) jumlah / count;
                System.out.println("Rata-rata adalah: " + rataRata);
            }

            System.out.print("Apakah Anda ingin melanjutkan (ya/tidak)? ");
            String pilihan = input.next().toLowerCase();

            if (!pilihan.equals("ya")) {
                lanjut = false;
            }
        }

        input.close();
    }
}
