import model.*;
import utils.FunctionUtils;
import utils.KRVData;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String check = "Yes";

        while(check != "No") {
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
                    "14.\tTop K bidders in particular category in particular Year");

            Scanner myScan = new Scanner(System.in);
            check = myScan.nextLine();



            switch (check) {
                case "1":
                    Optional<List<User>> users = FunctionUtils.getKTopUserWithMaxComments.apply(KRVData.marketplace, 2, 2022);

                    for (User us: users.get()){
                        System.out.println(us);
                    }

            }
        }
//
//            Optional<List<User>> users = FunctionUtils.getKTopUserWithMaxComments.apply(marketplace, 2, 2022);
//            if(users.isPresent()){
//
//                System.out.println(users.toString());
//            }
//
////            FunctionUtils.getKProductWithMaximumBids.apply(marketplace, 2, 2022);
////
////            FunctionUtils.productsWithHighestBids.apply(marketplace, 2022);
////
////            FunctionUtils.getKTopExpensiveBiddableProduct.apply(marketplace, 2, 2022);
////
////            FunctionUtils.getTopKUserInParticularLocationInYCatWithHighPrice.apply(marketplace, 2, 2022, "Fairfield", "Electronics");
////
////            FunctionUtils.getTopKUserWhoUploadedProductWithMaximumImages.apply(marketplace, 2, 2022);
////
////            FunctionUtils.getTopKUSerWhoseProductExpiredOnYDateAddedToWishList.apply(marketplace, 2, LocalDate.parse("2022-01-10"));
////
////            FunctionUtils.totalCommentsOnUsersProduct.apply(marketplace, 2022);
////
////            FunctionUtils.popularImagelessProductsByComments.apply(marketplace, 2022);
////
////            FunctionUtils.usersWithHighestComments.apply(marketplace, 2022);
////
////            FunctionUtils.usersProductsWithAtLeastKComments.apply(marketplace, 2022, 3);
////
////            FunctionUtils.topKUsersWhoseProductIsSoldMaximum.apply(marketplace, 2022, 3);
////
////            FunctionUtils.getTopKExpensiveBiddableProductAddedToWishList.apply(marketplace, 3, 2022);
////
////            FunctionUtils.getTopKBiddersInParticularCategoryInParticularYear.apply(marketplace, category1, 2, 2022);
//        }


    }
}
