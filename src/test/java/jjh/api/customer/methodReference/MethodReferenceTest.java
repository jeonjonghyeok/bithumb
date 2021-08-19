package jjh.api.customer.methodReference;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.hamcrest.MatcherAssert.assertThat;

public class MethodReferenceTest {
    class MethodReferenceClass{
        Supplier<Date> newDate = Date::new;
        Consumer<String> print = System.out::println;
        Function<Object, String> objectToString = String::valueOf;
        Function<String,Integer> stringToInteger = Integer::parseInt;
        BiFunction<Integer,Integer,Integer> integerMax = Math::max;

    }

    @Test
    void listSortTest() {
        List<String> list = Arrays.asList("Apple","Orange","Kiwi");
        list.sort(Comparator.comparingInt(String::length));
        list.forEach(System.out::println);

    }
    @Test
    void maxTest() {
        List<Integer> list = Arrays.asList(4,1,5,3);
        MethodReferenceClass mc = new MethodReferenceClass();
        mc.print.accept("hi");

    }

}
