package nomor_3;

public class User extends UserProfile {

    public User(int userId, String password, String name, int age, String emailId, String doc) {
        super(userId, password, name, age, emailId, doc);
    }

    // Metode untuk login
    public void logIn(int userId, String password) {
        if (this.getUserId() == userId && this.getPassword().equals(password)) {
            System.out.println("Login berhasil untuk pengguna: " + getName());
        } else {
            System.out.println("Login gagal. Periksa user ID dan password.");
        }
    }

    // Metode untuk pemulihan password
    public void recoverPassword() {
        System.out.println("Pemulihan kata sandi untuk pengguna: " + getName());
    }

    // Metode untuk logout
    public void logOut() {
        System.out.println("Logout berhasil untuk pengguna: " + getName());
    }
}
