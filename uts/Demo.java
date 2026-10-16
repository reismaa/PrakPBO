package uts;

public class Demo {
    public static void main(String[] args) {

        UserProfile profilCustomer = new UserProfile(
            1, "customer123", "Andi", 20,
            "andi@email.com", "KTP.pdf"
        );

        UserProfile profilAdmin = new UserProfile(
            2, "admin123", "Budi", 25,
            "admin@email.com", "Admin.pdf"
        );

        Customer customer = new Customer(profilCustomer);
        Admin admin = new Admin(profilAdmin);

        System.out.println("=== DATA CUSTOMER ===");
        profilCustomer.tampilkanProfil();

        System.out.println("\n=== LOGIN CUSTOMER ===");
        boolean loginCustomer =
            customer.log_in_user_id(1, "customer123");

        if (loginCustomer) {
            profilCustomer.show_documents();
            customer.apply_verification();
            customer.tampilkanStatus();
        }

        System.out.println("\n=== LOGIN ADMIN ===");
        boolean loginAdmin =
            admin.log_in_user_id(2, "admin123");

        if (loginAdmin) {
            admin.verify_user(customer);
            customer.tampilkanStatus();

            admin.add_vehicle("Mobil");
            admin.update_vehicle_details(101);
            admin.retrieve_complain();
        }

        System.out.println("\n=== LOGOUT ===");
        customer.log_out();
        admin.log_out();
    }
}
