package model;

public class Company {
    private String email;
    private String mobile;
    private String website;


    public Company() {
    }

    public Company(String email, String mobile, String website) {
        this.email = email;
        this.mobile = mobile;
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWebsite() {
        return website;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
