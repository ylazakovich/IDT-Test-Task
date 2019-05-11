package model;

public class Company {
    private String name;
    private String email;
    private String phone;
    private String website;


    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public Company(String email, String phone, String website) {
        this.email = email;
        this.phone = phone;
        this.website = website;
    }

    public Company(String name, String email, String phone, String website) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
