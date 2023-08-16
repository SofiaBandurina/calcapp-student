package ru.bandurina.calcapp.service;

public class ResultWriterService {

    public static void printTheResult(int num1, int num2, int result, String operationName) {
        System.out.println(operationName + num1 + " и " + num2 + " будет равно " + result);
    }
}
