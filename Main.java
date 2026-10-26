public class Main {
    public static void main(String[] args) {
        // Polimorfisme
        BangunDatar b1 = new Persegi(4.0);
        BangunDatar b2 = new Lingkaran(7.0);

        b1.info();
        System.out.println("Luas: " + b1.hitungLuas());
        System.out.println("--------------------------");

        b2.info();
        System.out.println("Luas: " + b2.hitungLuas());
    }
}