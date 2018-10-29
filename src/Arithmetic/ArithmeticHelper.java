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
                return new
            // TODO: 10/23/2018  
            default:
                throw new IllegalArgumentException();
        }
    }
}
