public enum Number {
    ZERO(0) , ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5);


    private final int actualnumber;


    Number(int actualnumber) {
        this.actualnumber = actualnumber;
    }

    int getActualnumber(){
        return actualnumber;
    }
}
