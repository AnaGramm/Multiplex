package logic.customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gramanas on 29-Dec-14.
 */
public class Shop {
    List<Customer> customers;

    public Shop() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer c){
        customers.add(c);
    }

    public Customer searchViaPhone(String phone){
        for (Customer customer : customers) {
            if (customer.getPhone().equals(phone)){
                return customer;
            }
        }
        return null;
    }

    public Customer searchViaName(String name){
        for (Customer customer : customers) {
            if (customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }


}
