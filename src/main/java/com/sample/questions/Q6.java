package com.sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Q6 extends Q {
    public Q6(BufferedReader br) { super(br); }

    public void question(int number) {
        super.question(number);
            System.out.println("    イカの足を日本では何と言われることが多いか？");
            System.out.println("    1:ゲソ");
            System.out.println("    2:アシ");
            System.out.println("    3:ウデ");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }
    public boolean check(int answer) {
        return answer == 2;
    }
}