package jjh.api.customer.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class CalculaterTest {
    @Test
    void main() {
        Calculater plus = (a,b) -> a+b;
        Calculater mul = (a,b) -> a*b;
        assertThat(plus.main(3,5), is(equalTo(8)));
        assertThat(mul.main(5,6), is(equalTo(30)));
    }
}