import java.util.Scanner;
public class Kafe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("MASUKAN MENU");
        menu = sc.nextLine();
        System.out.print("MASUKAN UKURAN CUP");
        ukuranCup = sc.next().charAt(0);
        System.out.print("MASUKAN JUMLAH: ");
        jumlah = sc.nextInt();
        System.out.print("MASUKAN KEANGGOTAAN (true / false): ");
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 1200;
                break;
            
            case "wine":
                hargaMenu = 150000;
                break;
        
            case "pizza":
                hargaMenu = 75000;
                break;
        }
        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'R':
                
                break;
        
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.50 * totalHarga;
        }
        double diskon = keanggotaan?0.1 :0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("ITEM YANG DIBELI: " +jumlah+ "" +menu+ " DENGAN UKURAN CUP" +ukuranCup);
        System.out.println("NOMINAL BAYAR: " +nominalBayar);
    }
    
}
