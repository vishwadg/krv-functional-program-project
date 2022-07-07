package utils;

import model.Marketplace;
import model.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FunctionUtils {
    static TriFunction<Marketplace,Long,Integer, Optional<List<User>>> d=(marketplace,k,year)->
         Stream.of(marketplace).flatMap(m->m);
    ;
}
