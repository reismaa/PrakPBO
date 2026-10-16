package uts;

public class Admin extends User {

    public Admin(UserProfile profile) {
        super(profile);
    }

    public void update_vehicle_details(int vehicle_id) {
        System.out.println(
            "Data kendaraan ID " + vehicle_id
            + " berhasil diperbarui."
        );
    }

    public void add_vehicle(String vehicle_name) {
        System.out.println(
            "Kendaraan " + vehicle_name
            + " berhasil ditambahkan."
        );
    }

    public void retrieve_complain() {
        System.out.println(
            "Admin memeriksa keluhan pengguna."
        );
    }

    public void verify_user(Customer customer) {
        customer.update_verification_status(
            "Terverifikasi"
        );

        System.out.println(
            "Admin berhasil memverifikasi pengguna."
        );
    }
}
