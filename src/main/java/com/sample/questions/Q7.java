package com.sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Q7 extends Q {
    public Q7(BufferedReader br) { super(br); }

    public void question(int number) {
        super.question(number);
            System.out.println("    外国由来のジャガイモの名前の由来は、一説によると何という都市に由来しているといるか？");
            System.out.println("    1:ジャガトウ");
            System.out.println("    2:ジャパン");
            System.out.println("    3:ジャカルタ");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }

    public boolean check(int answer) {
        return answer == 2;
    }
}