class Lingkaran extends BangunDatar {
    double r;

    public Lingkaran(double r) {
        super("Lingkaran");
        this.r = r;
    }

    @Override
    double hitungLuas() {
        return Math.PI * r * r;
    }
}