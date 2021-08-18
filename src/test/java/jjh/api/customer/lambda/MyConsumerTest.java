package jjh.api.customer.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class MyConsumerTest {

    @Test
    void main() {
        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(56);
        printElements(list,consumer);
    }
    private static <T> void printElements(List<T> list, Consumer<T> consumer){
        for (T t: list){
            consumer.accept(t);
        }
    }
}