package uts;

public class UserProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc;

    public UserProfile(int user_id, String password,
                       String name, int age,
                       String email_id, String doc) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail_id() {
        return email_id;
    }

    public String getDoc() {
        return doc;
    }

    public void edit_profile(String name, int age,
                             String email_id) {
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        System.out.println("Profil berhasil diperbarui.");
    }

    public void show_documents() {
        System.out.println("Dokumen: " + doc);
    }

    public void tampilkanProfil() {
        System.out.println("ID User : " + user_id);
        System.out.println("Nama    : " + name);
        System.out.println("Usia    : " + age);
        System.out.println("Email   : " + email_id);
    }
}
