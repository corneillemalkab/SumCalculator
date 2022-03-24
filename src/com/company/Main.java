package com.company;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator Result = new SimpleCalculator();

        Result.setFirstNumber(12);
        Result.setSecondNumber(10);

        System.out.println(Result.getDivisionResult());
        System.out.println(Result.getAdditionResult());
        System.out.println(Result.getMultiplicationResult());
        System.out.println(Result.getSubtractionResult());
    }
}
