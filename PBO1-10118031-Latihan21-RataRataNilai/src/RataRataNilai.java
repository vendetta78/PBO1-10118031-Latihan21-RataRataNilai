
import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk menghitung rata rata nilai
 */
public class RataRataNilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        int jumlah = scanner.nextInt();
        double ratarata;
        ratarata = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + " : ");
            ratarata += scanner.nextInt();
        }

        ratarata /= jumlah;
        System.out.println("Maka, Rata-rata Nilainya adalah " + ratarata);
        System.out.println("Developed by : Rizki Aria Putra");
    }

}
