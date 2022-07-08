package utils;

import model.Marketplace;
import model.Product;
import model.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionUtils {
    //    Top K list of Users with maximum comments (with timeframe)
    public static TriFunction<Marketplace, Long, Integer, Optional<List<User>>> getKTopUserWithMaxComments = (market, k, year) ->
            Optional.of(Stream.of(market).flatMap(m -> m.getProducts().stream())
                    .flatMap(p -> p.getComments().stream())
                    .flatMap(co -> co.getUser().getComments().stream())
                    .filter(com -> com.getCreatedAt().getYear() == year)
                    .collect(Collectors.groupingBy(comm -> comm.getUser()))
                    .entrySet()
                    .stream().sorted((c1, c2) -> (int) (c2.getValue().stream().count() - c1.getValue().stream().count()))
                    .limit(k)
                    .map(u -> u.getKey())
                    .collect(Collectors.toList()));


    //    Single Product with maximum bids (with timeframe)
    public static TriFunction<Marketplace, Long, Integer, Optional<Product>> getKProductWithMaximumBids = (market, k, year) ->
            Stream.of(market).flatMap(m -> m.getProducts().stream())
                    .flatMap(b -> b.getBids().stream())
                    .filter(c -> c.getCreatedAt().getYear() == year)
                    .collect(Collectors.groupingBy(p -> p.getProduct()))
                    .entrySet()
                    .stream()
                    .sorted((p1, p2) -> (int) (p1.getKey().getBids().stream().count() - p2.getKey().getBids().stream().count()))
                    .findFirst()
                    .map(e -> e.getKey());

}
