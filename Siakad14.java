import java.util.Scanner;
public class Siakad14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan nomor absen: ");
        int noAbsen = input.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = input.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = input.nextDouble();

        
        double nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        
        String nilaiHuruf;
        String kualifikasi;

        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") nomor absen " + noAbsen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}

