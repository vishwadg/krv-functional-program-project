package model;

import java.time.LocalDate;

public class Comment {
    private String content;
    private Product product;
    private User user;
    private LocalDate createdAt;

    public Comment() {
    }

    public Comment(String content, Product product, User user, LocalDate createdAt) {
        this.content = content;
        this.product = product;
        this.user = user;
        this.createdAt = createdAt;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
