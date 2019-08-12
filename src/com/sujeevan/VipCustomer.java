package com.sujeevan;

public class VipCustomer
{
    private String Name;
    private double limit;
    private String Email;

    public VipCustomer() {
        this("Default Name ",00.00," Default email");
    }

    public VipCustomer(String name, double limit) {
        Name = name;
        this.limit = limit;
    }

    public VipCustomer(String name, double limit, String email) {
        Name = name;
        this.limit = limit;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return Email;
    }
}
