package model;

import java.time.LocalDate;

public class WishList {
    private Product product;
    private User user;
    private LocalDate createdAt;

    public WishList() {
    }

    public WishList(Product product, User user, LocalDate createdAt) {
        this.product = product;
        this.user = user;
        this.createdAt = createdAt;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
