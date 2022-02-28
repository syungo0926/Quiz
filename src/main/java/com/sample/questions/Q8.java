package com.sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Q8 extends Q {
    public Q8(BufferedReader br) { super(br); }

    public void question(int number) {
        super.question(number);
            System.out.println("    口の中でデンプンは何の消化要素で何へ分解されるか？");
            System.out.println("    1:マルコス");
            System.out.println("    2:マルトース");
            System.out.println("    3:マルソース");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }

    public boolean check(int answer) {
        return answer == 2;
    }
}