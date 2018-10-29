package Arithmetic;

import Abstraction.ArithmeticMethod;

public class AMMinus implements ArithmeticMethod<Double> {

    @Override
    public Double doCalculation(Double first, Double second) {
        return first - second;
    }

    @Override
    public String toString() {
        return "-";
    }
}
