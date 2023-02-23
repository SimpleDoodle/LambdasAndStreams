package _01_lambdas;

import _01_lambdas.interfaces.AFunctionalInterface;
import java.math.BigDecimal;

public class LambdasDemo {
    /*
     * In Java, a lambda expression is a short-handed way to create an
     * object from an interface with a single abstract method.
     * Here is the syntax for an interface whose one abstract method has
     * 2 input parameters with a return type of int:
     *
     *      <InterfaceType> variableName = (input1, input2) -> {
     *          // Some code
     *          return 0;
     *      }
     *
     * Objects can't be created from interfaces so the lambda expression
     * creates an anonymous class (and object) that implements the interface.
     *
     * Unlike JavaScript, Java can't assign method definitions to variables
     * so this syntax is a work-around for that. That is why the
     * lambda expression syntax looks like a method definition:
     *      (inputParameter1, inputParameter2) -> { // code for method }
     *
     * If an interface has more than 1 abstract method then a lambda expression
     * can't be used. An interface with exactly 1 abstract method is called
     * a Functional Interface.
     */

    public static void main(String[] args) {
        /*
         * This is an anonymous class that implements an interface
         */
        AFunctionalInterface objectFromAnonClass = new AFunctionalInterface() {
            @Override
            public int someMethod(String input1, BigDecimal input2) {
                System.out.println("This is an anonymous class that implements an interface");
                System.out.println(input1 + ", " + input2.toString());
                return 0;
            }
        };

        /*
         * This is a lambda expression.
         * This is the same as the example with an anonymous class.
         */
        AFunctionalInterface objectFromLambda = (input1, input2) -> {
            System.out.println("This is a lambda expression");
            System.out.println(input1 + ", " + input2);
            return 0;
        };

        objectFromAnonClass.someMethod("a string", BigDecimal.TEN);
        objectFromLambda.someMethod("a string", BigDecimal.TEN);

        /*
         * NotAFunctionalInterface has 2 abstract methods so a lambda
         * expression can't be used
         */
//        NotAFunctionalInterface objectFromLambda2 = () -> {
//            System.out.println("This doesn't work");
//        };
    }
}
