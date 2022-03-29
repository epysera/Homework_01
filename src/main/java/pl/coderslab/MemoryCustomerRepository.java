package pl.coderslab;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemoryCustomerRepository implements CustomerRepository {
    private HashMap<Integer, Customer> customerHashMap = new HashMap<>();
    private CustomerLogger customerLogger;

    public MemoryCustomerRepository(CustomerLogger customerLogger) {
        this.customerLogger = customerLogger;
    }

    @Override
    public void addCustomer(int id, Customer customer) {
        customerHashMap.put(id, customer);
        customerLogger.log();
    }

    @Override
    public void deleteCustomer(int id) {
        customerHashMap.remove(id);
        customerLogger.log();
    }

    @Override
    public void customerList() {
        Set<Map.Entry<Integer, Customer>> entrySet = customerHashMap.entrySet();
        for (Map.Entry<Integer, Customer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

        customerLogger.log();
    }
}


