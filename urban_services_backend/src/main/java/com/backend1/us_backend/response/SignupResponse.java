package com.backend1.us_backend.response;

import com.backend1.us_backend.entity.Customer;

public class SignupResponse {
    
    private String message;
    public Customer customer;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
