package com.xworkz.methods.inbuilt_methods;

import java.util.Date;
import java.util.Objects;
import java.util.function.*;

public class Execution
{
    public static void main(String[] args)
    {
        BiConsumer<String, Integer> bitConsumer = (name, age) -> System.out.println("Name:" + name + "\nAge:" + age);
        bitConsumer.accept("ravi", 49);
        System.out.println("-----------------------------------------------------------");

        BiFunction<Boolean, Character, Boolean> biFunction = (vote, gender) ->
        {
            System.out.println("vote:" + vote + "\nGender:" + gender);
            return vote;
        };
        biFunction.apply(true,'M');
        System.out.println("--------------------------------------------------------------");


        BinaryOperator<Long> binaryOperator=(mobileNumber,adhar)->
        {
            System.out.println("mobile number:" + mobileNumber+"\nadhar:"+adhar);
            return mobileNumber;
        };
        binaryOperator.apply(123456789L,235533221234L);
        System.out.println("---------------------------------------------------------------");

        BiPredicate<Integer,Integer> biPredicate=(number,number2)->
        {
            System.out.println("id:"+number+"\nrange:"+number2);
            return number>number2;
        };
        biPredicate.test(8765,34567);
        System.out.println("---------------------------------------------------------------");

        BooleanSupplier booleanSupplier=() -> false;
            System.out.println(booleanSupplier.getAsBoolean());
        System.out.println("---------------------------------------------------------------");

        Consumer<Date> consumer=(today) -> System.out.println(today);
        consumer.accept(new Date());
        System.out.println("---------------------------------------------------------------");

        DoubleBinaryOperator doubleBinaryOperator=(double1,double2)->
        {
            System.out.println("double1:"+double1+"\n"+"double2:"+double2);
            return double1+double2;
        };
        doubleBinaryOperator.applyAsDouble(12.34,56.78);
        System.out.println("---------------------------------------------------------------");

        DoubleConsumer doubleConsumer=(double1) -> System.out.println(double1);
        doubleConsumer.accept(12.34);
        System.out.println("---------------------------------------------------------------");

        DoubleFunction<Float> doubleFunction=(number)->
        {
            System.out.println(number);
            return 0.0f;
        };
        doubleFunction.apply(12.77);
        System.out.println("---------------------------------------------------------------");

        // DoublePredicate
        DoublePredicate doublePredicate = (number) ->
        {
            System.out.println("Number: " + number);
            return number > 10.0;
        };
        doublePredicate.test(15.5);
        System.out.println("---------------------------------------------------------------");


        DoubleSupplier doubleSupplier = () -> 123.45;
        System.out.println(doubleSupplier.getAsDouble());
        System.out.println("---------------------------------------------------------------");


        DoubleToIntFunction doubleToIntFunction = (number) ->
        {
            System.out.println("Double: " + number);
            return (int) number;
        };
        doubleToIntFunction.applyAsInt(45.89);
        System.out.println("---------------------------------------------------------------");


        DoubleToLongFunction doubleToLongFunction = (number) ->
        {
            System.out.println("Double: " + number);
            return (long) number;
        };
        doubleToLongFunction.applyAsLong(999.99);
        System.out.println("---------------------------------------------------------------");


        DoubleUnaryOperator doubleUnaryOperator = (number) ->
        {
            System.out.println("Double: " + number);
            return number * 2;
        };
        doubleUnaryOperator.applyAsDouble(20.5);
        System.out.println("---------------------------------------------------------------");


        Function<String, Integer> function = (name) ->
        {
            System.out.println("Name: " + name);
            return name.length();
        };
        function.apply("Ravi");
        System.out.println("---------------------------------------------------------------");


        IntBinaryOperator intBinaryOperator = (num1, num2) ->
        {
            System.out.println("Num1: " + num1 + "\nNum2: " + num2);
            return num1 + num2;
        };
        intBinaryOperator.applyAsInt(10, 20);
        System.out.println("---------------------------------------------------------------");


        IntConsumer intConsumer = (number) ->
        {
            System.out.println("Number: " + number);
        };
        intConsumer.accept(100);
        System.out.println("---------------------------------------------------------------");


        IntFunction<String> intFunction = (number) ->
        {
            System.out.println("Number: " + number);
            return "Value = " + number;
        };
        intFunction.apply(500);
        System.out.println("---------------------------------------------------------------");


        IntPredicate intPredicate = (number) ->
        {
            System.out.println("Number: " + number);
            return number % 2 == 0;
        };
        intPredicate.test(24);
        System.out.println("---------------------------------------------------------------");


        IntSupplier intSupplier = () -> 999;
        System.out.println(intSupplier.getAsInt());
        System.out.println("---------------------------------------------------------------");


        IntToDoubleFunction intToDoubleFunction = (number) ->
        {
            System.out.println("Number: " + number);
            return number * 1.5;
        };
        intToDoubleFunction.applyAsDouble(100);
        System.out.println("---------------------------------------------------------------");


        IntToLongFunction intToLongFunction = (number) ->
        {
            System.out.println("Number: " + number);
            return (long) number;
        };
        intToLongFunction.applyAsLong(1000);
        System.out.println("---------------------------------------------------------------");


        IntUnaryOperator intUnaryOperator = (number) ->
        {
            System.out.println("Number: " + number);
            return number * number;
        };
        intUnaryOperator.applyAsInt(12);
        System.out.println("---------------------------------------------------------------");


        LongBinaryOperator longBinaryOperator = (num1, num2) ->
        {
            System.out.println("Long1: " + num1 + "\nLong2: " + num2);
            return num1 + num2;
        };
        longBinaryOperator.applyAsLong(100L, 200L);
        System.out.println("---------------------------------------------------------------");

        LongConsumer longConsumer = (number) ->
        {
            System.out.println("Long: " + number);
        };
        longConsumer.accept(9876543210L);
        System.out.println("---------------------------------------------------------------");


        LongFunction<String> longFunction = (number) ->
        {
            System.out.println("Long: " + number);
            return "Value = " + number;
        };
        longFunction.apply(99999999L);
        System.out.println("---------------------------------------------------------------");


        LongPredicate longPredicate = (number) ->
        {
            System.out.println("Long: " + number);
            return number > 1000L;
        };
        longPredicate.test(5000L);
        System.out.println("---------------------------------------------------------------");


        LongSupplier longSupplier = () -> 123456789L;
        System.out.println(longSupplier.getAsLong());
        System.out.println("---------------------------------------------------------------");


        LongToDoubleFunction longToDoubleFunction = (number) ->
        {
            System.out.println("Long: " + number);
            return number * 2.5;
        };
        longToDoubleFunction.applyAsDouble(200L);
        System.out.println("---------------------------------------------------------------");


        LongToIntFunction longToIntFunction = (number) ->
        {
            System.out.println("Long: " + number);
            return (int) number;
        };
        longToIntFunction.applyAsInt(500L);
        System.out.println("---------------------------------------------------------------");

        LongUnaryOperator longUnaryOperator = (number) ->
        {
            System.out.println("Long: " + number);
            return number + 100;
        };
        longUnaryOperator.applyAsLong(1000L);
        System.out.println("---------------------------------------------------------------");


        ObjDoubleConsumer<String> objDoubleConsumer = (name, salary) ->
        {
            System.out.println("Name: " + name + "\nSalary: " + salary);
        };
        objDoubleConsumer.accept("Ravi", 45000.50);
        System.out.println("---------------------------------------------------------------");


        ObjIntConsumer<String> objIntConsumer = (name, age) ->
        {
            System.out.println("Name: " + name + "\nAge: " + age);
        };
        objIntConsumer.accept("Ravi", 25);
        System.out.println("---------------------------------------------------------------");


        ObjLongConsumer<String> objLongConsumer = (name, mobile) ->
        {
            System.out.println("Name: " + name + "\nMobile: " + mobile);
        };
        objLongConsumer.accept("Ravi", 9876543210L);
        System.out.println("---------------------------------------------------------------");

        Predicate<String> predicate = (name) ->
        {
            System.out.println("Name: " + name);
            return name.startsWith("R");
        };
        predicate.test("Ravi");
        System.out.println("---------------------------------------------------------------");

        Supplier<String> supplier = () -> "Welcome Java";
        System.out.println(supplier.get());
        System.out.println("---------------------------------------------------------------");


        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (a, b) ->
        {
            System.out.println("A: " + a + "\nB: " + b);
            return a + b + 0.5;
        };
        toDoubleBiFunction.applyAsDouble(10, 20);
        System.out.println("---------------------------------------------------------------");


        ToDoubleFunction<String> toDoubleFunction = (name) ->
        {
            System.out.println("Name: " + name);
            return name.length();
        };
        toDoubleFunction.applyAsDouble("Ravi");
        System.out.println("---------------------------------------------------------------");

        ToIntBiFunction<String, String> toIntBiFunction = (str1, str2) ->
        {
            System.out.println("Str1: " + str1 + "\nStr2: " + str2);
            return str1.length() + str2.length();
        };
        toIntBiFunction.applyAsInt("Java", "Oracle");
        System.out.println("---------------------------------------------------------------");

        ToIntFunction<String> toIntFunction = (name) ->
        {
            System.out.println("Name: " + name);
            return name.length();
        };
        toIntFunction.applyAsInt("Functional");
        System.out.println("---------------------------------------------------------------");

        ToLongBiFunction<Integer, Integer> toLongBiFunction = (a, b) ->
        {
            System.out.println("A: " + a + "\nB: " + b);
            return (long) (a * b);
        };
        toLongBiFunction.applyAsLong(100, 20);
        System.out.println("---------------------------------------------------------------");

        ToLongFunction<String> toLongFunction = (name) ->
        {
            System.out.println("Name: " + name);
            return (long) name.length();
        };
        toLongFunction.applyAsLong("Programming");
        System.out.println("---------------------------------------------------------------");

        UnaryOperator<String> unaryOperator = (name) ->
        {
            System.out.println("Name: " + name);
            return name.toUpperCase();
        };
        unaryOperator.apply("ravi");
        System.out.println("---------------------------------------------------------------");
    }
}