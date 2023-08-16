package ru.bandurina.calcapp._main;

import ru.bandurina.calcapp.service.ResultWriterService;
import ru.bandurina.calcapp.util.Calculator;

public class _Main {

    public static void main(String[] args) {
        int num1 = 120;
        int num2 = 10;
        int result = Calculator.summ(num1, num2);
        ResultWriterService.printTheResult(num1, num2, result, "Если сложить числа ");
        result = Calculator.diff(num1, num2);
        ResultWriterService.printTheResult(num1, num2, result, "Если вычесть числа ");
        result = Calculator.comp(num1, num2);
        ResultWriterService.printTheResult(num1, num2, result, "Если умножить числа ");
    }
}
