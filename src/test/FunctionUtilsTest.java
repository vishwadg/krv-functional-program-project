package test;

import model.Comment;
import model.Marketplace;
import model.Product;
import model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FunctionUtilsTest {

    private Marketplace marketplace;

    private User user;

    private Product product;


    private List<Product> products;

    private List<Comment> comments;

    private List<User> users;


    @BeforeEach
    void setUp() {
        marketplace = new Marketplace();


    }

    @AfterEach
    void tearDown() {
    }
}