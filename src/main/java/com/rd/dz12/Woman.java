package com.rd.dz12;

public class Woman extends Person {
    private String city;
    private String country;
    private Person partner;
    private int age;
    private String oldLastName;

    public Woman(String firstName, String lastName, String city, String country, Person partner, int age, String oldLastName) {
        super(firstName, lastName);
        this.city = city;
        this.country = country;
        this.partner = partner;
        this.age = age;
        this.oldLastName = oldLastName;
    }

    @Override
    public Person getPartner() {
        return partner;
    }

    @Override
    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public String getOldLastName() {
        return oldLastName;
    }

    public void setOldLastName(String oldLastName) {
        this.oldLastName = oldLastName;
    }

    public String getCity() {
        return city;
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
        return age >= 60;
    }

    public void registerPartnership(Person person) {
        if (partner == null) {
            partner = person;
            person.setPartner(this);
            person.setLastName(getLastName());
        }
    }

        public void deregisterPartnership ( boolean returnToPreviousLastName){
            if (partner != null) {
                partner.setPartner(null);
                partner = null;
                if (returnToPreviousLastName) {
                    setLastName(getLastName().replace(getOldLastName(), ""));
                }
            }
        }
}