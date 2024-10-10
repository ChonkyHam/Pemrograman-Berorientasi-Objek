class Televisi extends PerangkatElektronik {
    public Televisi(String nama) {
        super(nama);
    }

    @Override
    public String fungsi() {
        return "Menonton acara";
    }

    public static void main(String[] args)
    {
        Televisi tv = new Televisi("Televisi");
        System.out.println(tv.nama + ": " + tv.fungsi());
    }
}