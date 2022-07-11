import model.*;
import utils.FunctionUtils;
import utils.KRVData;

import java.time.LocalDate;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        String check = "Yes";

        while (check != "No") {
            System.out.println("\n\nPlease enter your choices \n\n" +
                    "1.\tTop K list of Users with maximum comments\n" +
                    "2.\tK Product with maximum bids\n" +
                    "3.\tEach product with highest bids\n" +
                    "4.\tMost top K expensive biddable product added\n" +
                    "5.\tTop K users in particular city who uploaded product in Y category with high price\n" +
                    "6.\tTop K users who uploaded product with maximum images\n" +
                    "7.\tTop K User whose product expired before Y date which is added to wishlist by other user\n" +
                    "8.\tTotal comments in particular users product on particular day\n" +
                    "9.\tImageless product receiving most comments in particular day\n" +
                    "10.\tTop K users who uploaded negotiable product with highest comments\n" +
                    "11.\tUsers Product with at least K Comments\n" +
                    "12.\tTop K users whose product sold in Y year\n" +
                    "13.\tMost top K expensive biddable product added to wishlist\n" +
                    "14.\tTop K bidders in particular category in particular Year\n\n");

            Scanner myScan = new Scanner(System.in);
            check = myScan.nextLine();
            Scanner uScan = new Scanner(System.in);
            int uTopInput, uYearInt;
            switch (check) {
                case "1":
                    System.out.println("Please enter top value");
                    uTopInput = uScan.nextInt();
                    if (uTopInput < 1) {
                        System.out.println("Input is not valid");
                    } else {
                        Optional<List<User>> users = FunctionUtils.getKTopUserWithMaxComments.apply(KRVData.marketplace, uTopInput, 2022);
                        for (User us : users.get()) {
                            System.out.println(us);
                        }
                    }
                    break;

                case "2":
                    System.out.println("Please enter top value");
                    uTopInput = uScan.nextInt();
                    System.out.println("Please enter year value(eg.2022)");
                    uYearInt = uScan.nextInt();
                    if (uTopInput < 1) {
                        System.out.println("Input is not valid");
                    } else {
                        Optional<List<Product>> products = FunctionUtils.getKProductWithMaximumBids.apply(KRVData.marketplace, uTopInput, uYearInt);
                        for (Product product : products.get()) {
                            System.out.println(product);
                        }
                    }
                    break;

                case "3":
                    Map<Product, Optional<Bid>> bids = FunctionUtils.productsWithHighestBids.apply(KRVData.marketplace, 2022);
                    break;

                case "4":
                    System.out.println("Please enter top value");
                    uTopInput = uScan.nextInt();
                    System.out.println("Please enter year value(eg.2022)");
                    uYearInt = uScan.nextInt();
                    if (uTopInput < 1) {
                        System.out.println("Input is not valid");
                    } else {
                        Optional<List<Product>> products1 = FunctionUtils.getKTopExpensiveBiddableProduct.apply(KRVData.marketplace, uTopInput, uYearInt);
                        for (Product product : products1.get()) {
                            System.out.println(product);
                        }
                    }
                    break;

                case "5":
                    System.out.println("Please enter top value");
                    uTopInput = uScan.nextInt();
                    System.out.println("Please enter year value(eg.2022)");
                    uYearInt = uScan.nextInt();
                    if (uTopInput < 1) {
                        System.out.println("Input is not valid");
                    } else {
                        Optional<List<User>> users1 = FunctionUtils.getTopKUserInParticularLocationInYCatWithHighPrice.apply(KRVData.marketplace, uTopInput, uYearInt, "Fairfield", "Electronics");
                        for (User user : users1.get()) {
                            System.out.println(user);
                        }
                    }
                    break;

                case "6":
                    System.out.println("Please enter top value");
                    uTopInput = uScan.nextInt();
                    System.out.println("Please enter year value(eg.2022)");
                    uYearInt = uScan.nextInt();
                    if (uTopInput < 1) {
                        System.out.println("Input is not valid");
                    } else {
                        Optional<List<User>> users2 = FunctionUtils.getTopKUserWhoUploadedProductWithMaximumImages.apply(KRVData.marketplace, uTopInput, uYearInt);
                        for (User user : users2.get()) {
                            System.out.println(user);
                        }
                    }
                    break;

                case "7":
                    System.out.println("Please enter top value");
                    uTopInput = uScan.nextInt();
                    if (uTopInput < 1) {
                        System.out.println("Input is not valid");
                    } else {
                        Optional<List<User>> users3 = FunctionUtils.getTopKUSerWhoseProductExpiredOnYDateAddedToWishList.apply(KRVData.marketplace, uTopInput, LocalDate.parse("2022-01-10"));
                        for (User user : users3.get()) {
                            System.out.println(user);
                        }
                    }
                    break;

                case "8":
                    Map<User, List<Comment>> comments = FunctionUtils.totalCommentsOnUsersProduct.apply(KRVData.marketplace, 2022);
                    break;

                case "9":
                    List<Product> products2 = FunctionUtils.popularImagelessProductsByComments.apply(KRVData.marketplace, 2022);
                    break;

                case "10":
                    Map<User, List<Comment>> comments1 = FunctionUtils.usersWithHighestComments.apply(KRVData.marketplace, 2022);
                    break;

                case "11":
                    Map<User, List<Comment>> comments2 = FunctionUtils.usersProductsWithAtLeastKComments.apply(KRVData.marketplace, 2022, 3);
                    break;

                case "12":
                    Map<User, List<Product>> userProduct = FunctionUtils.topKUsersWhoseProductIsSoldMaximum.apply(KRVData.marketplace, 2022, 3);
                    break;

                case "13":
                    Optional<List<Product>> products3 = FunctionUtils.getTopKExpensiveBiddableProductAddedToWishList.apply(KRVData.marketplace, 3, 2022);
                    break;

                case "14":
                    Optional<List<User>> users4 = FunctionUtils.getTopKBiddersInParticularCategoryInParticularYear.apply(KRVData.marketplace, KRVData.category1, 2, 2022);
                    break;

            }
        }
    }
}
