package main;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;     // 前回出した手
    private int currentHandValue = 0;  // 今回出した手
    // それぞれの要素には、勝った回数が格納される
    // history[0][0] -- グー、グーと自分が出したときの過去の勝ち数
    // history[0][1] -- グー、チョキと自分が出したときの過去の勝ち数
    // history[0][2] -- グー、パーと自分が出したときの過去の勝ち数
    private int[][] history = {
        { 1, 1, 1 },
        { 1, 1, 1 },
        { 1, 1, 1 },
    };
    
    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    /**
     * 次の手を決める
     * @return: Hand
     *   仮に今回 グー を出したとして、getSum()が 15 だったとして、
     *   bet の範囲は以下のようになる。
     *              0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
     *   bet の範囲 +----+---------+---------------------+
     *                0       1               2
     *   つまり、過去の勝ち数が多いほど、勝つ確率が高くなると考えるわけである。
     */
    public Hand nextHand() {
        // bet -- 0 から getSum() までの間で数字を決める
    	int sum = getSum(currentHandValue);
        int bet = random.nextInt(sum);
        int handvalue = 0;
        //  自分がグーで相手もグーのときの勝ち数よりもbetが小さければ
        if (bet < history[currentHandValue][0]) {
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;
        } else {
            handvalue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    /**
     * 今回出した手と次の手(3通り)との合計を求める
     * 仮に今回グーを出したとして、次の手との合計は、
     *     history[0][0] -- 仮に3   // 今回グー、次回グー
     *   + history[0][1] -- 仮に5   // 今回グー、次回チョキ
     *   + history[0][2] -- 仮に7   // 今回グー、次回パー
     *  -------------------------
     *            sum    --    15
     * となる。
     */
    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + history[hv][i];
        }
        return sum;
    }

    /**
     * 確率の学習
     * @param: boolean
     *   勝ったということは、今回出した手の勝ち数を +1 する。
     *   負けたということは、それ以外の手の勝ち数を +1 する。
     */
    public void study(boolean win) {
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}

// 修正時刻: Sun Jan 30 13:49:54 2022
