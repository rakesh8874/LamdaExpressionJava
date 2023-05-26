package com.jap.customers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class CustomerService{
    public List<Customer> getListOfCustomers()
{
    List <Customer> customerList = new ArrayList<>();
    Customer rohan = new Customer(110,"Rohan","Male",true,"Gurgaon");
    Customer sam = new Customer(108,"Sam","Male",false,"Delhi");
    Customer martin = new Customer(115,"Martin","Male",true,"Noida");
    Customer kushagra = new Customer(120,"Kushagra","Male",false,"Banglore");
    Customer anjali = new Customer(109,"Anjali","Female",false,"Chennai");
    customerList.add(rohan);
    customerList.add(sam);
    customerList.add(martin);
    customerList.add(kushagra);
    customerList.add(anjali);
    return customerList;
}
    // This method will return the names of the customers in sorted alphabetical order.
    public List<String> getListOfCustomersSortedByName(List<Customer> customerList) {
    List<String> list = new ArrayList<>();
        Collections.sort(customerList);
    Iterator<Customer> iterator = customerList.iterator();
   while (iterator.hasNext()){
   Customer customer = iterator.next();
     list.add(customer.getCustomerName());
   }
   return list;
    }
 public static void main(String[] args) {
    CustomerService cs = new CustomerService();
    List<Customer> list1 = new ArrayList<>();
    list1 = cs.getListOfCustomers();
    List<String> list = cs.getListOfCustomersSortedByName(list1);
     System.out.println(list);
   }
}
