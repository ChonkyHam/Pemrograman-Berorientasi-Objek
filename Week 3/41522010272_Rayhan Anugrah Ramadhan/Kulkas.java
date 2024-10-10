class Kulkas extends PerangkatElektronik {

    public Kulkas(String nama) {
        super(nama);
    }

    @Override
    public String fungsi() {
        return "Menyimpan makanan";
    }

    public static void main(String[] args) {
        Kulkas kulkas = new Kulkas("Kulkas");
        System.out.println(kulkas.nama + ": " + kulkas.fungsi());
    }
}