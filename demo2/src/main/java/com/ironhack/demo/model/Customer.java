package com.ironhack.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    private int idCustomer;
    private String customerName;
    private String customerStatus;
    private int totalCustomerMileage;

    //constructors
    public Customer() {}

    public Customer(int idCustomer, String customerName, String customerStatus, int totalCustomerMileage) {
        this.idCustomer = idCustomer;
        this.customerName = customerName;
        this.customerStatus = customerStatus;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public int getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(int totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }
}
