package model;

public class Person {
    private String name;
    private String surname;
    private String company_name;
    private String address;
    private String city;
    private String county;
    private String state;
    private String phone1;
    private String phone2;
    private int zip;
    private String email;
    private String web;

    public Person(){ }

    public Person(String name, String surname, String company_name, String address, String city, String county, String state, String phone1, String phone2, int zip, String email, String web) {
        this.name = name;
        this.surname = surname;
        this.company_name = company_name;
        this.address = address;
        this.city = city;
        this.county = county;
        this.state = state;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.zip = zip;
        this.email = email;
        this.web = web;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
}
