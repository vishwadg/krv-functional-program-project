package utils;

import model.Marketplace;
import model.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionUtils {
//    static TriFunction<Marketplace,Long,Integer, Optional<List<User>>> getKTopUserWithMaxComments=(marketplace,k,year)->
//         Optional.of(Stream.of(marketplace)
//                 .flatMap(m->m.getProducts().stream())
//                 .flatMap(p->p.getComments().stream())
//                 .flatMap(c->c.getComments().stream())
//                 .filter(d->d.getCreatedAt().getYear() == year)
//                 .collect(Collectors.groupingBy(u -> u.getUser()))
//                 .entrySet()
//                 .stream().sorted((c1, c2)->(int)(c2.getValue().stream().count() - c1.getValue().stream().count()))
//                 .limit(k)
//                 .map(e ->e.getKey())
//                 .collect(Collectors.toList()));

}
