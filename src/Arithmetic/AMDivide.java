package Arithmetic;

import Abstraction.ArithmeticMethod;

public class AMDivide implements ArithmeticMethod<Double> {

    @Override
    public Double doCalculation(Double first, Double second) throws Exception {
        if (second == 0) {
            throw new Exception("divided by zero");
        }
        return first / second;
    }

    @Override
    public String toString() {
        return "/";
    }
}
