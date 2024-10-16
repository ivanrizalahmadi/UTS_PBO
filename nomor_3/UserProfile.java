package nomor_3;

public class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private String doc; // Tipe dokumen: .jpg, .png, .pdf

    // Constructor
    public UserProfile(int userId, String password, String name, int age, String emailId, String doc) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.doc = doc;
    }

    // Getters
    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getDoc() {
        return doc;
    }

    // Metode untuk mengedit profil
    public void editProfile(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        System.out.println("Profil telah diperbarui.");
    }

    // Metode untuk menampilkan dokumen
    public void showDocuments() {
        System.out.println("Dokumen pengguna: " + doc);
    }
}
