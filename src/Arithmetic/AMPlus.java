package Arithmetic;

public class AMPlus implements ArithmeticMethod<Double> {

    @Override
    public Double doCalculation(Double first, Double second) {
        return first + second;
    }

}
