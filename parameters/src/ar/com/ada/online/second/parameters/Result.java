package ar.com.ada.online.second.parameters;

public class Result {
    private Integer resultSum;
    private Integer resultSubtraction;
    private Integer multiplication;
    private Integer division;

    //constructor
    public Result() {
    }

    // getters and setters
    public Integer getResultSum() {
        return this.resultSum;
    }

    public void setResultSum(Integer resultSum) {
        this.resultSum = resultSum;
    }

    public Integer getResultSubtraction() {
        return this.resultSubtraction;
    }

    public void setResultSubtraction(Integer resultSubtraction) {
        this.resultSubtraction = resultSubtraction;
    }

    public Integer getResultMultiplication() {
        return this.multiplication;
    }

    public void setResultMultiplication(Integer multiplication) {
        this.multiplication = multiplication;
    }

    public Integer getResultDivision() {
        return this.division;
    }

    public void setResultDivision(Integer division) {
        this.division = division;
    }

}

