package jjh.api.customer.methodReference;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorReferenceTest {

    @Test
    void main() {
        Function<Runnable, Thread> threadGenerator = Thread::new;
        Runnable t1 = () -> System.out.println("T1 excuted");
        Runnable t2 = () -> System.out.println("T2 excuted");
        Thread thread1 = threadGenerator.apply(t1);
        Thread thread2 = threadGenerator.apply(t2);

        thread1.start();
        thread2.start();
        threadGenerator
                .apply(()-> System.out.println("T3 excuted"))
                .start();
    }
}