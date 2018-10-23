package Arithmetic;

public interface ArithmeticMethod<E> {

    /**
     * Specific calculation implemented
     * @return the arithmetic result
     */
    public E doCalculation(E first, E second);

}
