# Tugas PBO: Kalkulator Luas Bangun Datar (Abstract Class & Polymorphism)

Repositori ini dibuat untuk memenuhi tugas kelompok mata kuliah Pemrograman Berorientasi Objek[span_1](start_span)[span_1](end_span).

## Anggota Kelompok
* Tiha Karyati - F1D02510028
* Nurrabiatu Zahra - F1D02510022

---

## Penerapan Konsep PBO

1. **Abstract Class (Kelas Abstrak)**
   * Kelas `BangunDatar` bertindak sebagai kerangka dasar yang memiliki atribut `nama` dan metode abstrak `hitungLuas()`.

2. **Inheritance (Pewarisan)**
   * Kelas `Persegi` dan `Lingkaran` mewarisi sifat serta atribut dari kelas induk `BangunDatar`.

3. **Polymorphism (Polimorfisme)**
   * Objek `b1` dan `b2` dideklarasikan menggunakan tipe data induk (`BangunDatar`), namun diisi dengan objek turunan yang berbeda (`Persegi` dan `Lingkaran`). Ketika metode `hitungLuas()` dipanggil, program otomatis mengeksekusi rumus yang sesuai dengan bentuk objek aslinya.