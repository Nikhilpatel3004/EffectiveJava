public class Batsman {
    private final Integer score;
    private final Integer ball;

    public Batsman(Integer score, Integer ball) {
        this.score = score;
        this.ball = ball;
    }

    public Integer getScore() {
        return score;
    }


    public Integer getBall() {
        return ball;
    }



//    if ball or run will be add so we create new object
    public Batsman add(Batsman bat){
        return  new Batsman(this.score + bat.score , this.ball + bat.ball);
    }


    public Batsman valueOf(){
        return  new Batsman(this.score,this.ball);
    }
}

