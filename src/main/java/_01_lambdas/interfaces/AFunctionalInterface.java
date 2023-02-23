package _01_lambdas.interfaces;

import java.math.BigDecimal;

/*
 * Because there is exactly one abstract method,
 * this interface can be used in a lambda expression
 */
public interface AFunctionalInterface {
    int someMethod(String input1, BigDecimal input2);
}
