package uts;

public class Customer extends User {
    private String verification_status =
            "Belum diverifikasi";

    public Customer(UserProfile profile) {
        super(profile);
    }

    public String get_verification_status() {
        return verification_status;
    }

    public void apply_verification() {
        verification_status = "Menunggu verifikasi";
        System.out.println(
            "Pengajuan verifikasi berhasil dikirim."
        );
    }

    public void update_verification_status(String status) {
        verification_status = status;
    }

    public void tampilkanStatus() {
        System.out.println(
            "Status verifikasi: " + verification_status
        );
    }
}
