package com.sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Q4 extends Q {
    public Q4(BufferedReader br) { super(br); }

    public void question(int number) {
        super.question(number);
            System.out.println("    時には嘘も必要であるということを何という？");
            System.out.println("    1:嘘も方言");
            System.out.println("    2:嘘も方便");
            System.out.println("    3:嘘も報告");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }

    public boolean check(int answer) {
        return answer == 2;
    }
}