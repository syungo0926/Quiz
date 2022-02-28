package com.sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Q2 extends Q {
    public Q2(BufferedReader br) { super(br); }

    public void question(int number) {
        super.question(number);
            System.out.println("    フランスの首都はどこですか？");
            System.out.println("    1:パリ");
            System.out.println("    2:ニース");
            System.out.println("    3:カンヌ");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }

    public boolean check(int answer) {
        return answer == 1;
    }
}
