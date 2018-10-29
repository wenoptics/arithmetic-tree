package Arithmetic;

import Abstraction.ArithmeticMethod;

public class ArithmeticHelper {
    
    public static ArithmeticMethod parseFromChar(char c) {
        switch (c) {
            case '+':
                return new AMPlus();
            case '-':
                return new AMMinus();
            case '*':
            case 'x':
            case 'X':
                return new AMMultiply();
            case '/':
            case '÷':
                return new AMDivide();
            default:
                throw new IllegalArgumentException();
        }
    }
}
