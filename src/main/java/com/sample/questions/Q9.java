package com.sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Q9 extends Q {
    public Q9(BufferedReader br) { super(br); }

    public void question(int number) {
        super.question(number);
            System.out.println("    株主で構成される株式会社の基本的な方針や重要事項を話し合う機関");
            System.out.println("    1:国際連合総会");
            System.out.println("    2:株主総会");
            System.out.println("    3:PTA総会");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }

    public boolean check(int answer) {
        return answer == 2;
    }
}