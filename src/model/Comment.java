package model;

import java.time.LocalDate;

public class Comment {
    public String content;
    public LocalDate localDate;

    public Product product;
    public User user;
    public LocalDate createdAt;

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

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
