package _01_lambdas.interfaces;

/*
 * Because there are two abstract methods, this interface
 * can't be used in a lambda expression
 */
public interface NotAFunctionalInterface {
    void someMethod1();
    void someMethod2();
}
