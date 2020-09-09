package ar.com.ada.online.second.parameters;

public class Arithmetic {

    public Integer sum(Result resultSum, int a, int b) {
        resultSum.setResultSum(a + b);
        return resultSum.getResultSum();
    }

    public Integer subtraction(Result resultSubtraction, int a, int b) {
        resultSubtraction.setResultSubtraction(a - b);
        return resultSubtraction.getResultSubtraction();
    }

    public Integer multiplication(Result multiplication, int a, int b) {
        multiplication.setResultMultiplication(a * b);
        return multiplication.getResultMultiplication();
    }

    public Integer division(Result division, int a, int b) {
        division.setResultDivision(a / b);
        return division.getResultDivision();
    }

}
