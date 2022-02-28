package com.sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Q {
    BufferedReader bufferedReader;

    public Q(BufferedReader br) { bufferedReader = br; }

    public void inform(int number) {
        while (true) {
            question(number);
            int answer = 0;
            String message = "    ハズレ、もう一度考えてみてね";

            try {
                String buf = bufferedReader.readLine();
                answer = Integer.parseInt(buf);
            }
            catch (Exception exception) {
                answer = 0;
                message = "    答えを番号で入力して下さい";
            }
            if (check(answer)) {
                message = "    正解、良く出来ました";
                System.out.println(message);
                break;
            }
            System.out.println(message);
        }
    }

    public void question(int number) {
        System.out.println("\n    第"+ (number + 1)  +"問！！");
    }
    public boolean check(int answer) { return false; }
}

