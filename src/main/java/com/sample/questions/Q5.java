package com.sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Q5 extends Q {
    public Q5(BufferedReader br) { super(br); }

    public void question(int number) {
        super.question(number);
            System.out.println("    その道のことは専門家が一番であるということを何という？");
            System.out.println("    1:餅はもち吉");
            System.out.println("    2:餅は餅屋");
            System.out.println("    3:餅はもち米");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }


    public boolean check(int answer) {
        return answer == 2;
    }
}