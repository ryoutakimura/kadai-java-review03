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
    //引数3つのコンストラクタ
    public BaseBallTeam(String name, int win, int lose,int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //勝率を計算してdouble型で返すメソッド
    public double getRate() {
        //勝率＝勝ち数/(勝ち数+負け数)
        double rate = (double)this.win / (this.win +this.lose);
        return rate;
    }

    //試合結果を表示するメソッド
    public void report() {
        System.out.println(this.name + "の2022年の成績は" + this.win +"勝" +this.lose+"敗" +this.draw+"分、勝率は"+this.getRate()+"です。");
    }

}
