package model;

import java.time.LocalDate;

public class Bid {
    private double bidValue;
    private User user;
    private Product product;
    private LocalDate createdAt;

    public Bid() {
    }

    public Bid(double bidValue, User user, Product product, LocalDate createdAt) {
        this.bidValue = bidValue;
        this.user = user;
        this.product = product;
        this.createdAt = createdAt;
    }

    public double getBidValue() {
        return bidValue;
    }

    public void setBidValue(double bidValue) {
        this.bidValue = bidValue;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
