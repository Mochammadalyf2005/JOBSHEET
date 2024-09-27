import java.util.Scanner;
public class PemilihanHari14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayType;

        System.out.print("Masukan data hari: ");
        dayName = sc.nextLine();

        switch (dayName) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "MONDAYFRIDAY":
                dayType = "Weekend ";
            
                break;
        
            case "SATURDAY":
            case "SUNDAY":
                dayType = "Weekend ";
                break;

            default:
                dayType = "Nama Hari Gagal";    
        }

        System.out.println(dayName + "is a" + dayType);
    }
    
}
