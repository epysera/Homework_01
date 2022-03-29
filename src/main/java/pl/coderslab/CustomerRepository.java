package pl.coderslab;

public interface CustomerRepository {
    void addCustomer(int id, Customer customer);
    void deleteCustomer (int id);
    void customerList ();
}
