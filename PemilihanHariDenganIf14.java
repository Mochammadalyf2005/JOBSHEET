import java.util.Scanner;
public class PemilihanHariDenganIf14 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int dayNumber;

    System.out.print("Masukan nomor hari (1-7) : ");
    dayNumber = sc.nextInt();

    if (dayNumber >= 1 && dayNumber <= 5) {
        System.out.println("Hari Biasa");
    } else if (dayNumber == 6 || dayNumber == 7) {
        System.out.println("Hari Libur");

    } else {
        System.out.println("Nomor Invalid");
    }
}
}
