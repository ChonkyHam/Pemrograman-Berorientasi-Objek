package Week_3;

// Kelas induk Perangkat Elektronik
class PerangkatElektronik {
    protected String nama; // Atribut nama

    // Konstruktor untuk menginisialisasi nama perangkat elektronik
    public PerangkatElektronik(String nama) {
        this.nama = nama;
    }

    // Metode fungsi() yang akan di-override di subclass
    public String fungsi() {
        return "Fungsi perangkat elektronik";
    }

    // Metode untuk mendapatkan nama perangkat
    public String getNama() {
        return nama;
    }
}

// Subclass Televisi yang mewarisi dari PerangkatElektronik
class Televisi extends PerangkatElektronik {

    // Konstruktor yang memanggil konstruktor superclass
    public Televisi(String nama) {
        super(nama);
    }

    // Override metode fungsi() untuk memberikan fungsi khusus dari Televisi
    @Override
    public String fungsi() {
        return "Menonton acara";
    }
}

// Subclass Kulkas yang mewarisi dari PerangkatElektronik
class Kulkas extends PerangkatElektronik {

    // Konstruktor yang memanggil konstruktor superclass
    public Kulkas(String nama) {
        super(nama);
    }

    // Override metode fungsi() untuk memberikan fungsi khusus dari Kulkas
    @Override
    public String fungsi() {
        return "Menyimpan makanan";
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Televisi dan Kulkas
        Televisi tv = new Televisi("Televisi Samsung");
        Kulkas kulkas = new Kulkas("Kulkas LG");

        // Menampilkan fungsi dari setiap perangkat elektronik
        System.out.println(tv.getNama() + ": " + tv.fungsi());
        System.out.println(kulkas.getNama() + ": " + kulkas.fungsi());
    }
}