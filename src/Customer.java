// ================= FILE: Customer.java =================
public class Customer {

    // OOP Concept: Encapsulation (fields are private, exposed via getters)
    private String name;
    private String phone;

    // OOP Concept: this keyword (distinguishes instance field from parameter)
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }
}