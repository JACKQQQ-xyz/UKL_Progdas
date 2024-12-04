import java.util.Scanner;

public class soal3no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Siswa : ");
        int jumlahSiswa = scanner.nextInt();

        int[] kehadiran = new int[jumlahSiswa];
        double total = 0;

        for(int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan Jumlah Hari Siswa ke-"+(i+1)+" : ");
            kehadiran[i] = scanner.nextInt();
            total = kehadiran[i] + total;
        }

        System.out.println("Rekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja : 24) : ");

        for(int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-"+(i+1)+" : "+kehadiran[i]+" Hari Hadir");
        }

        double ratarata = total / jumlahSiswa;
        System.out.println("Rata - Rata Kehadiran Siswa : "+ratarata+" Hari");

        System.out.println("Kesimpulan : ");
        System.out.println("Siswa Yang Kehadirannya di Atas Rata-Rata : ");
        for(int i = 0; i < jumlahSiswa; i++){
            if(kehadiran[i] > ratarata){
                System.out.println("Siswa ke-"+(i+1)+" ("+kehadiran[i]+" Hari)");
            }
        }

        System.out.println("Siswa Yang Kehadirannya di Bawah Rata-Rata : ");
        for(int i = 0; i < jumlahSiswa; i++){
            if(kehadiran[i] < ratarata){
                System.out.println("Siswa ke-"+(i+1)+" ("+kehadiran[i]+" Hari)");
            }
        }
    }
}
