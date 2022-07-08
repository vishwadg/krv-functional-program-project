package test;

import model.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FunctionUtilsTest {

    private Marketplace marketplace;


    @BeforeEach
    void setUp() {
        Marketplace marketplace = new Marketplace("KRV MarketPlace", "Fairfield", "12345");

        User user1 = new User("Jhon", "Doe", "jhondoe@gmail.com", "USA", "IA", "Fairfield", 52557, 32.123, 12.123);
        User user2 = new User("Johnny", "Depp", "johnnydepp@gmail.com", "USA", "LA", "Fairfield", 52557, 32.123, 12.123);
        User user3 = new User("Amber", "Heard", "amberheard@gmail.com", "USA", "CA", "Fairfield", 52557, 32.123, 12.123);

        Image image1 = new Image("/path1/image1.jpg");
        Image image2 = new Image("/path2/image2.jpg");
        Image image3 = new Image("/path3/image3.jpg");


        Category category1 = new Category( "Electronics", "This is Electronics");
        Category category2 = new Category("Furniture", "This is Furniture");
        Category category3 = new Category("Fashion", "This is Fashion");

        Product product1 = new Product("Iphone1", "Iphone1 Description ", 1200, true, true, LocalDate.parse("2022-01-01"),
                LocalDate.parse("2022-01-10"), ProductStatus.NEW, 20, 20.123, 23.123, category1, user1);

        Product product2 = new Product("Samsung 123", "Samsung Description ", 600, true, true, LocalDate.parse("2022-05-01"),
                LocalDate.parse("2022-05-10"), ProductStatus.NEW, 20, 20.123, 23.123, category1, user2);

        Product product3 = new Product("Today's Telegram Leather Jacket", "First Class Leather Jacket Description ", 40, true, true, LocalDate.parse("2022-03-01"),
                LocalDate.parse("2022-03-20"), ProductStatus.NEW, 50, 20.123, 23.123, category3, user3);

        Bid bid1 = new Bid(1210, user2, product1, LocalDate.parse("2022-01-05"));
        Bid bid2 = new Bid(650, user1, product2, LocalDate.parse("2022-01-05"));
        Bid bid3 = new Bid(60, user2, product3, LocalDate.parse("2022-01-05"));

        Comment comment1 = new Comment("This is comment for Product 1", product1, user3, LocalDate.parse("2022-01-07"));
        Comment comment2 = new Comment("This is comment for Product 2", product2, user1, LocalDate.parse("2022-05-07"));
        Comment comment3 = new Comment("This is comment for Product 3", product3, user2, LocalDate.parse("2022-03-07"));





    }

    @AfterEach
    void tearDown() {
    }
}