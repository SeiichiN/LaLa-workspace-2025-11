package main;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    // 初期値は false。つまり「負け」
    private boolean won = false;
    // 前回の手
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    public Hand nextHand() {
        // !won == true すなわち 前回が 負け ならば
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    public void study(boolean win) {
        won = win;
    }
}

// 修正時刻: Sun Jan 30 14:09:07 2022
