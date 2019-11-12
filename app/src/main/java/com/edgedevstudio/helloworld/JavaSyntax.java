package com.edgedevstudio.helloworld;

import java.util.Random;

/**
 * Created by Olorunleke Opeyemi on 2019-11-12.
 **/
public class JavaSyntax {
    public static void main(String[] args) {

    }

    public static void throwExceptionHanlingStatement() {
        String string = null;
        if (string == null) {
            // Throws exception
            throw new NullPointerException();
        } else {
            System.out.println("Length of String  = " + string.length());
        }

    }
    public static void tryCatchFinallyExceptionHanlingStatement() {

        try {
            // Statements that may throw exceptions
        } catch (Exception ex) {
            // Exception caught and handled here
        } finally {
            // Statements always executed after the try/catch blocks
        }

    }
    public static void jumpReturnStatement() {
        for (int a = 1; a <= 3; a++) { // loop A
            print("loop a index = " + a);
            for (int b = 1; b <= 3; b++) { //loop B
                print("loop b index = " + b);
                print("a = " + a + ", b = " + b);
                if (a == b) {
                    print("a equals b");
                    return;
                }
            }
            print("----------------");
        }
    }
    public static void forIterationLoop() {
        for (int index = 1; index <= 10; index++) {
            print("For Loop Index = " + index);
        }
    }

    public static void doWhileIterationLoop() {
        int i = 1;
        do {
            print("Do While Loop Index = " + i);
            i++;
        } while (i <= 10);
    }

    public static void whileIterationLoop() {
// The condition is checked after every iteration.
        int i = 1;
        while (i <= 10) {
            print("Loop Index = " + i);
            i++;
        }
    }

    public static void switchControlStatement() {
        int i = new Random().nextInt(10);
        print("the value of i = " + i);
        switch (i) {
            case 0:
                System.out.println("i = 0");
                break;
            case 1:
                System.out.println("i = 1");
                break;
            default:
                System.out.println("i is greater than 1");
                break;
        }
    }

    public static void conditionalControlStatement() {
        int i = new Random().nextInt(10);
        print("the value of Random No = " + i);
        if (i <= 3) {
            System.out.println("i is less than or equal to 3");
        } else if (i <= 6) {
            System.out.println("i is less than or equal to 6");
        } else {
            System.out.println("i greater than 6");
        }
    }

    public static void relationalOperators() {
        int x = 21;
        int y = 22;

        if (x == y) {

        }

        if (x != y) {

        }

        if (x <= 10 && y >= 1) {

        }
    }

    public static void logicalOperators() {
        int a = 7;
        int b = 5;
        boolean bool = true;

        print("Negate Bool = " + (!bool));

        if (a < 10 && b > 1) {

        }

        if (a < 10 || b > 1) {

        }

        if (!bool) {

        }
    }

    public static void assignmentOperators() {
        int a = 900;
        a += 100; // a = a + 100

        int b = 900;
        b -= 50; // b= b-50;

        int c = 50;
        c *= 2;

        int d = 40;
        d /= 4;

        int e = 47;
        e %= 3;

    }

    public static void arithemticDecrementOperator() {
        int valOne = 9;

        int result = --valOne;

        print("Result of -- Sign = " + result);

    }

    public static void arithemticIncrementOperators() {
        int valOne = 9;

        int result = ++valOne;

        print("Result of ++ Sign = " + result);

    }

    public static void arithemticDModuloOperators() {
        int valOne = 9;
        int valTwo = 2;

        int result = valOne / valTwo;

        print("Result of % Sign = " + result);

    }

    public static void arithemticDiviOperators() {
        int valOne = 8;
        int valTwo = 2;

        int result = valOne / valTwo;

        print("Result of / Sign = " + result);

    }

    public static void arithemticMultiOperators() {
        int valOne = 20;
        int valTwo = 30;

        int result = valOne * valTwo;

        print("Result of * Sign = " + result);

    }

    public static void arithemticMinusOperators() {
        int valOne = 20;
        int valTwo = 30;

        int result = valOne - valTwo;

        print("Result of - Sign = " + result);

    }

    public static void arithemticPlusOperators() {
        int valOne = 20;
        int valTwo = 30;

        int result = valOne + valTwo;

        print("Result of + Sign = " + result);

    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void variableNamingDeclarationAndAssignment() {
        int myNum = 5; // This is an Integer, it only accepts whole numbers
        float myDecimalPointNumber = 69.9f; // this
        char myChar = 'D';
        boolean myBool = true;
        String mySweetShortStory = "Lorem Ipsum Dolor";
    }
}
