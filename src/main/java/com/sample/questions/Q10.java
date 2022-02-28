package com.sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Q10 extends Q {
    public Q10(BufferedReader br) { super(br); }

    public void question(int number) {
        super.question(number);
            System.out.println("    ヒマラヤ山脈に生息しているといわれている全身毛だらけの未確認生物といえば？");
            System.out.println("    1:スーモ");
            System.out.println("    2:雪男");
            System.out.println("    3:イエティ");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }
    public boolean check(int answer) {
        return answer == 2;
    }
}