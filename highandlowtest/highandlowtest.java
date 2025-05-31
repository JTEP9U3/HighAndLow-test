package highandlowtest;
import java.util.Scanner; //Java標準ライブラリより「Scanner」をインポート
public class HighAndLow {
 
    public static void main(String[] args) {
    //エントリーポイント、(String[] args)でコマンドラインからの引数受取
        Scanner sc = new Scanner(System.in); //標準入力の受取準備
        int winCount = 0;  // 勝利数をカウントするための変数
     

     while(true){ //ループ処理の開始
      
            int leftCard = (int)(Math.random()*9)+1;
            int rightCard = (int)(Math.random()*9)+1;
 //(int)(Math.random()*9)で0から9までの少数部切り捨ての乱数を生成、末尾の+1で下限を1にする　少数切り捨ての整数化は(int)によるもの
 
            System.out.println("**************");
            System.out.println("* High & Low *");
            System.out.println("**************");
//ゲームタイトル「High & Low」の表示
 
            System.out.println(""); //レイアウト調整用の空行

 
            System.out.println("  [問題表示]");
            System.out.println("*****    *****");
            System.out.println("*   *    * * *");
            System.out.println("* " + leftCard + " *    * * *");
            System.out.println("*   *    * * *");
            System.out.println("*****    *****");
            //左側カードの状態を視覚情報化
            
            System.out.print(" High  or  Low ?(h/l)＞");
            String select = sc.nextLine();
            //問題文「High  or  Low ?(h/l)＞」を表示し回答を要求、 sc.nextLine();にて標準入力内容の受取
 
            if(select.equals("h")){
                System.out.println(" →Highを選択しました。");
            }else{
                System.out.println(" →Lowを選択しました。");
            }
            //「h」を入力で「 →Highを選択しました。」を表示、それ以外なら「→Lowを選択しました。」を表示
 
            System.out.println(""); //レイアウト調整用の空行
 
            System.out.println("  [結果表示]");
            System.out.println("*****    *****");
            System.out.println("*   *    *   *");
            System.out.println("* " + leftCard + " *    * " + rightCard + " *");
            System.out.println("*   *    *   *");
            System.out.println("*****    *****");
            //結果の表示、先程の左側に加え右のカード情報を開示
            
            String result = null; //「result」の初期化
 
            if(leftCard < rightCard){
                result = "h";
            }else if(leftCard > rightCard){
                result = "l";
            }else{
                result = select;
            }
            //カードの数値が左より右の方が大きければ「h」、小さければ「l」、等しい場合は入力した内容を「result」に設定
 
            if(select.equals(result)){
                winCount++;  // 勝利数を増やす
              if(winCount == 1){
                System.out.println(" →You Win!");
                }else{
                System.out.println(" →You Win!" + winCount + "連勝!!");
                }
            }else{
                System.out.println(" →You Lose...");
                break;
            }
            //勝敗の判定、「result」の設定が入力した内容と一致で勝ち　「ループ処理の開始」に戻りゲーム続行、不一致で負け　「break;」でループ処理終了
      
            System.out.println(""); //レイアウト調整用の空行
 
        }
 
        System.out.println("--ゲーム終了--"); //「ゲーム終了」を表示
 
 
    }
 
}
