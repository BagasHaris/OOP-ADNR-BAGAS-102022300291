// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();

    public void tambahMakananKering() {
        
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Makanan    : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Jumlah Makanan    : ");
        int jumlah = sc.nextInt();
        System.out.print("Masukkan Harga Makanan    : ");
        double harga = sc.nextDouble();
        sc.nextLine();
        System.out.print("Masukkan Brand Makanan    : ");
        String brand = sc.nextLine();
  
        // Todo : Create a new object for MakananKering
        daftarMakananKering.add(new MakananKering(nama, brand, jumlah, harga));
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("====================================");
        System.out.println("Makanan kering berhasil ditambahkan!");
        
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Makanan    : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Jumlah Makanan    : ");
        int jumlah = sc.nextInt();
        System.out.print("Masukkan Harga Makanan    : ");
        double harga = sc.nextDouble();
        sc.nextLine();
        System.out.print("Masukkan Bahan Makanan    : ");
        String bahan = sc.nextLine();
        // Todo : Create a new object for MakananBasah
        daftarMakananBasah.add(new MakananBasah(nama, bahan, jumlah, harga));
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.println("====================================");
        System.out.println("Makanan Basah berhasil ditambahkan!");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            System.out.println("Tidak ada Makanan dalam inventaris.");
        } else {
            // Todo : Create print notification for Makanan Kering  
            for (MakananKering makanan : daftarMakananKering ){
                makanan.showData();
            }
            for (MakananBasah makanan : daftarMakananBasah ){
                makanan.showData();
            }
        }
    }
}