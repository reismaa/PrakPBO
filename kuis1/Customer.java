package kuis1;
import java.util.ArrayList;

public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private String phone;

    private ArrayList<Order> orders;

    public Customer(int customerID, String customerName, String address, String phone) {
        this.customerId = customerID;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
        this.orders = new ArrayList<>();
    }

    public int getCustomerID() {
        return customerId;
    }

    public void setCustomerID(int customerID) {
        this.customerId = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void addCustomer() {
        System.out.println("Customer berhasil ditambahkan.");
    }

    public void editCustomer() {
        System.out.println("Data customer berhasil diubah.");
    }

    public void deleteCustomer() {
        System.out.println("Customer berhasil dihapus.");
    }
}