package nomor_3;

public class Admin extends User {

    public Admin(int userId, String password, String name, int age, String emailId, String doc) {
        super(userId, password, name, age, emailId, doc);
    }

    // Menambah kendaraan baru
    public void addVehicle() {
        System.out.println("Menambahkan kendaraan baru ke sistem.");
    }

    // Memperbarui detail kendaraan
    public void updateVehicleDetails(int vehicleId) {
        System.out.println("Memperbarui detail untuk kendaraan dengan ID: " + vehicleId);
    }

    // Mengambil keluhan pengguna
    public void retrieveComplaint() {
        System.out.println("Mengambil keluhan dari pengguna.");
    }

    // Memverifikasi pengguna
    public void verifyUser(Customer customer) {
        if (!customer.getVerificationStatus()) {
            customer.applyVerification();
            System.out.println("Pengguna " + customer.getName() + " telah diverifikasi oleh Admin.");
        } else {
            System.out.println("Pengguna " + customer.getName() + " sudah terverifikasi.");
        }
    }
}
