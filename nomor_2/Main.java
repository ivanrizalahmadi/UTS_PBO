package nomor_2;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.model = "SUV";
        mobil.merek = "Toyota";
        mobil.tahun = 2022;
        mobil.jumlahRoda = 4;
        mobil.jenisBahanBakar = "Bensin";
        mobil.jumlahPintu = 4;
        mobil.adaAC = true;
        mobil.nyalakan();
        mobil.berkendara();
        mobil.putarMusik();

        Perahu perahu = new Perahu(true, "Kayu", 6);
        perahu.model = "Perahu Nelayan";
        perahu.merek = "Yamaha";
        perahu.tahun = 2019;
        perahu.jenisLambung = "Lambung Ganda";
        perahu.tenagaMesin = 150;
        perahu.nyalakan();
        perahu.berlayar();
        perahu.berlabuh();
        System.out.println("Material perahu: " + perahu.getJenisMaterial());
        System.out.println("Kapasitas penumpang maksimum: " + perahu.getKapasitasPenumpang());
    }
}
