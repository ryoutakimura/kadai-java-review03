package baseball;

public class BaseBallTeam {
    //フィールド
    private String name; //球団名
    private int win; //勝ち数
    private int lose; //負け数
    private int draw; //引き分け数

    //コンストラクタ
    public BaseBallTeam() {

    }

    public BaseBallTeam(String name, int win, int lose,int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //試合結果を表示するメソッド
    public void report() {
        System.out.println(this.name + "の2022年の成績は" + this.win +"勝" +this.lose+"敗" +this.draw+"分、勝率は実装中です。");
    }

}
