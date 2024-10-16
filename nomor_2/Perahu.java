package nomor_2;

// File: Perahu.java
public class Perahu extends KendaraanAir {
    private boolean adaLayar;
    private String jenisMaterial;
    private int kapasitasPenumpang;

    public Perahu(boolean adaLayar, String jenisMaterial, int kapasitasPenumpang) {
        this.adaLayar = adaLayar;
        this.jenisMaterial = jenisMaterial;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    // Getter dan Setter untuk adaLayar
    public boolean isAdaLayar() {
        return adaLayar;
    }

    public void setAdaLayar(boolean adaLayar) {
        this.adaLayar = adaLayar;
    }

    // Getter dan Setter untuk jenisMaterial
    public String getJenisMaterial() {
        return jenisMaterial;
    }

    public void setJenisMaterial(String jenisMaterial) {
        this.jenisMaterial = jenisMaterial;
    }

    // Getter dan Setter untuk kapasitasPenumpang
    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public void berlabuh() {
        System.out.println("Perahu sedang berlabuh");
    }
}
