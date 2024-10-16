package nomor_3;

public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(int userId, String password, String name, int age, String emailId, String doc) {
        super(userId, password, name, age, emailId, doc);
    }

    // Mendapatkan status verifikasi
    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    // Mengajukan verifikasi dengan dokumen
    public void applyVerification() {
        if (!verificationStatus) {
            verificationStatus = true;
            System.out.println("Verifikasi berhasil untuk pengguna: " + getName());
        } else {
            System.out.println("Pengguna: " + getName() + " sudah terverifikasi.");
        }
    }
}
