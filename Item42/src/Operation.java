import java.util.function.DoubleBinaryOperator;

public enum Operation {

    PLUS("+" , (x,y) -> {
        return x + y;
    }),
    SUB("-" , (x,y) -> {
        return x - y;
    }),
    MUL("*" , (x,y) -> {
        return x * y;
    }),
    DIV("/" , (x,y) -> {
        return x / y;
    });


    private final String symbol;
    private final DoubleBinaryOperator doubleBinaryOperator;


    Operation(String symbol, DoubleBinaryOperator doubleBinaryOperator) {
        this.symbol = symbol;
        this.doubleBinaryOperator = doubleBinaryOperator;
    }


    public double apply(double x,double y){
        return doubleBinaryOperator.applyAsDouble(x,y);
    }
}
