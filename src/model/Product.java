package model;

import java.time.LocalDate;
import java.util.List;

public class Product {
    public String name;
    public String description;
    public double price;
    public boolean isNegotiable;
    public boolean isBiddable;
    public LocalDate addedDate;
    public LocalDate expiryDate;
    public ProductStatus productStatus;
    public Integer views;
    public double latitude;
    public double longitude;
    public Category category;
    public List<Image> imageList;
    public List<User> bidders;
    public List<User> wishers;
    public List<User> commentars;
    public User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNegotiable() {
        return isNegotiable;
    }

    public void setNegotiable(boolean negotiable) {
        isNegotiable = negotiable;
    }

    public boolean isBiddable() {
        return isBiddable;
    }

    public void setBiddable(boolean biddable) {
        isBiddable = biddable;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<User> getBidders() {
        return bidders;
    }

    public void setBidders(List<User> bidders) {
        this.bidders = bidders;
    }

    public List<User> getWishers() {
        return wishers;
    }

    public void setWishers(List<User> wishers) {
        this.wishers = wishers;
    }

    public List<User> getCommentars() {
        return commentars;
    }

    public void setCommentars(List<User> commentars) {
        this.commentars = commentars;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
