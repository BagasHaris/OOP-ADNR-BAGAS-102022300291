// Don't delete any comments below!!!
// Todo: Import Scanner
import java.util.Scanner;

public class Main {
    public static int chooseMenu;

    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        ManajemenInventaris mi = new ManajemenInventaris();
        Scanner sc = new Scanner(System.in);
        // Todo : Create Loop list menu
        
        do { 
            System.out.println("\n==============Menu Inventaris Makanan EAD=============");
            System.out.println("1. Tambah Makanan Kering");
            System.out.println("2. Tambah Makanan Basah");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu    : ");
            chooseMenu = sc.nextInt();

            switch (chooseMenu) {
                case 1:
                    mi.tambahMakananKering();
                    break;
                case 2:
                    mi.tambahMakananBasah();
                    break;
                case 3:
                    mi.tampilkanSemuaMakanan();
                    break;
                case 4:
                    System.out.println("\nKeluar dari program.");
                    sc.close();
                    break;
                default:
                    System.out.println("\nMenu tidak tersedia");
            }
            
        } while (chooseMenu != 4);
    }
}
