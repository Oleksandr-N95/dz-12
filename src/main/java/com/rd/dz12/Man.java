package com.rd.dz12;

public class Man extends Person {
    private String city;
    private String country;
    private Person partner;
    private int age;

    public Man(String firstName, String lastName, String city, String country, Person partner, int age) {
        super(firstName, lastName);
        this.city = city;
        this.country = country;
        this.partner = partner;
    }
    public String getCity() {
        return city;
    }

    @Override
    public Person getPartner() {
        return partner;
    }

    @Override
    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRetired() {
        return age >= 65;
    }
    public void registerPartnership(Person person) {
        if (partner == null) {
            partner = person;
            person.setPartner(this);
        }
    }
    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (partner != null) {
            partner.setPartner(null);
            partner = null;
        }
    }
}
