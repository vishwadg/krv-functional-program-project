package utils;

import model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionUtils {
    //    Top K list of Users with maximum comments (with timeframe)
    public static TriFunction<Marketplace, Integer, Integer, Optional<List<User>>> getKTopUserWithMaxComments = (market, k, year) ->
            Optional.of(Stream.of(market)
                    .flatMap(m -> m.getProducts() != null ? m.getProducts().stream() : Stream.empty())
                    .flatMap(p -> p.getComments() != null ? p.getComments().stream() : Stream.empty())
                    .flatMap(co -> co.getUser().getComments().stream())
                    .filter(com -> com.getCreatedAt().getYear() == year)
                    .collect(Collectors.groupingBy(comm -> comm.getUser()))
                    .entrySet()
                    .stream().sorted((c1, c2) -> (int) (c2.getValue().stream().count() - c1.getValue().stream().count()))
                    .limit(k)
                    .map(u -> u.getKey())
                    .collect(Collectors.toList()));


    //    K Product with maximum bids (with timeframe)
    public static TriFunction<Marketplace, Integer, Integer, Optional<List<Product>>> getKProductWithMaximumBids = (market, k, year) ->
            Optional.of(Stream.of(market).flatMap(m -> m.getProducts() != null ? m.getProducts().stream() : Stream.empty())
                    .flatMap(b -> b.getBids() != null ? b.getBids().stream() : Stream.empty())
                    .filter(c -> c.getCreatedAt().getYear() == year)
                    .collect(Collectors.groupingBy(p -> p.getProduct()))
                    .entrySet()
                    .stream()
                    .sorted((p1, p2) -> p1.getKey().getBids() != null && p2.getKey().getBids() != null ?
                            (int) (p2.getKey().getBids().stream().count() - p1.getKey().getBids().stream().count()) : 0)
                    .limit(k)
                    .map(p -> p.getKey())
                    .collect(Collectors.toList()));


    //    =====================================================================================================
    //    3. Each product with highest bids
    static BiFunction<Product, Integer, Optional<Bid>> getHighestBid = (product, year) ->
            Stream.of(product)
                    .flatMap(p -> p.getBids()!=null?p.getBids().stream():Stream.empty())
                    .sorted((b1, b2) -> (int) (b2.getBidValue() - b1.getBidValue()))
                    .findFirst();


    public static BiFunction<Marketplace,Integer, Map<Product, Optional<Bid>>> productsWithHighestBids=(marketplace, year)->
        Stream.of(marketplace)
                .flatMap(m -> m.getProducts().stream())
                .collect(Collectors.toMap(product -> product, product -> getHighestBid.apply(product, year)));



    //    =====================================================================================================
    //14. Top K users who uploaded negotiable product with highest comments

    public static BiFunction<Marketplace,Integer,Map<User,List<Comment>>> usersWithHighestComments=(marketplace,year)->
            Stream.of(marketplace)
                    .flatMap(m->m.getProducts()!=null?m.getProducts().stream():Stream.empty())
                    .filter(p->p.isNegotiable())
                    .flatMap(p->p.getComments()!=null?p.getComments().stream():Stream.empty())
                    .collect(Collectors.groupingBy(c->c.getUser()))
                    .entrySet()
                    .stream()
//                    .sorted((e1,e2)->(int)(e2.getValue().stream().count()-e1.getValue().stream().count()))
                    .collect(Collectors.toMap(a->a.getKey(),b->b.getValue()));

}
