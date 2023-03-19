public enum Player {

    DHONI(49,24),
    VIRAT(100,54),
    ROHIT(264,173);

    private final int Score;
    private final int ball;

    Player(int Score,int ball){
        this.Score = Score;
        this.ball = ball;
    }

    public int getScore() {
        return Score;
    }
}
