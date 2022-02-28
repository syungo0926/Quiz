package com.sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Q3 extends Q {
    public Q3(BufferedReader br) { super(br); }

    public void question(int number) {
        super.question(number);
            System.out.println("    日本の首都はどこですか？");
            System.out.println("    1:東京");
            System.out.println("    2:大阪");
            System.out.println("    3:京都");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }

    public boolean check(int answer) {
        return answer == 1;
    }
}