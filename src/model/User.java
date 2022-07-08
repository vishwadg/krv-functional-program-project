package model;

import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private String state;
    private String city;
    private Integer zip;
    private Double userLat;
    private Double userLong;
    private List<Comment> comments;

    public User() {
    }

    public User(String firstName, String lastName, String email, String country, String state, String city, Integer zip,
                Double userLat, Double userLong) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.userLat = userLat;
        this.userLong = userLong;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public Double getUserLat() {
        return userLat;
    }

    public void setUserLat(Double userLat) {
        this.userLat = userLat;
    }

    public Double getUserLong() {
        return userLong;
    }

    public void setUserLong(Double userLong) {
        this.userLong = userLong;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
