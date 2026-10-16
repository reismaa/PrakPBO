package uts;

public class User {
    protected UserProfile profile;

    public User(UserProfile profile) {
        this.profile = profile;
    }

    public boolean log_in_user_id(int user_id,
                                  String password) {
        if (profile.getUser_id() == user_id
                && profile.getPassword().equals(password)) {
            System.out.println("Login berhasil.");
            return true;
        }

        System.out.println("Login gagal.");
        return false;
    }

    public void recover_password() {
        System.out.println(
            "Pemulihan password melalui email: "
            + profile.getEmail_id()
        );
    }

    public void log_out() {
        System.out.println("Logout berhasil.");
    }
}
