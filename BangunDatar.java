abstract class BangunDatar {
    String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    abstract double hitungLuas();

    public void info() {
        System.out.println("Nama Bangun Datar: " + nama);
    }
}