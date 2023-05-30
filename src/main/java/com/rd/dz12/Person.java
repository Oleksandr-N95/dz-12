package com.rd.dz12;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Person partner;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Person getPartner() {
        return partner;
    }
    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public boolean isRetired() {
        return false;
    }
    public void registerPartnership() {
    }
    public void deregisterPartnership() {
    }
}
