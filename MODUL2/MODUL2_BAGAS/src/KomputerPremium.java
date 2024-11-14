class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;

    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(boolean ruangPrivat) {
        this.ruangPrivat = ruangPrivat;
    }

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    } 

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

    public void informasi(){
        super.Informasi();
        if (ruangPrivat){
            System.out.println("Status          : Ruangan VVIP");
            System.out.println("\nFASILITAS RUANG VVIP");
            System.out.println("- Ruangan AC");
            System.out.println("- Kursi gaming");
            System.out.println("- Komputer spek dewa");
            System.out.println("- Koneksi hingga 100Mbps");
        }else{
            System.out.println("Status          : Ruangan Rakyat");
            System.out.println("\nFASILITAS RUANG RAKYAT");
            System.out.println("- Ruangan panas");
            System.out.println("- Kursi plastik");
            System.out.println("- Komputer spek kentang");
            System.out.println("- Koneksi hingga 1Mbps");

        }

        
        System.out.println("=========================================");
    }
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void pesan(int nomorKomputer){
        System.out.println("Menyewa komputer nomor : " +nomorKomputer);

    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan){  
        System.out.println("Menambah layanan makanan : " +makanan);

    }

    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman){
        System.out.println("Menambah layanan makanan : " +makanan+ " dan minuman : " +minuman);

    }

}
