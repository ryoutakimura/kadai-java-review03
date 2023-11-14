package baseball;

public class BaseBallTeam {
    //フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;

    //コンストラクタ
    public BaseBallTeam() {

    }

    public BaseBallTeam(String name, int win, int lose,int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

}
