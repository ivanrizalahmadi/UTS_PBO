package nomor_3;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Customer
        Customer customer = new Customer(101, "password123", "Ali", 25, "ali@example.com", "document.pdf");
        customer.logIn(101, "password123");
        customer.showDocuments();
        customer.applyVerification();
        System.out.println("Status Verifikasi: " + customer.getVerificationStatus());
        customer.logOut();

        // Membuat objek Admin
        Admin admin = new Admin(200, "adminPass", "Budi", 30, "budi@admin.com", "admin_doc.pdf");
        admin.logIn(200, "adminPass");
        admin.addVehicle();
        admin.updateVehicleDetails(1);
        admin.retrieveComplaint();
        admin.verifyUser(customer);
        admin.logOut();
    }
}
