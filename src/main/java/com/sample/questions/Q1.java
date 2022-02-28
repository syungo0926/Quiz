package com.sample.questions;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Q1 extends Q {
    public Q1(BufferedReader br) { super(br); }

    public void question(int number) {
        super.question(number);
            System.out.println("    アメリカの首都はどこですか？");
            System.out.println("    1:ニューヨーク");
            System.out.println("    2:ワシントン D.C.");
            System.out.println("    3:ロサンジェルス");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }

    public boolean check(int answer) {
        return answer == 2;
    }
}