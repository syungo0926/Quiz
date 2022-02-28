package com.sample;

import java.util.ArrayList;
import java.util.Collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

import com.sample.questions.Q;
import com.sample.questions.Q1;
import com.sample.questions.Q2;
import com.sample.questions.Q3;
import com.sample.questions.Q4;
import com.sample.questions.Q5;
import com.sample.questions.Q6;
import com.sample.questions.Q7;
import com.sample.questions.Q8;
import com.sample.questions.Q9;
import com.sample.questions.Q10;

class Quiz10 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        ArrayList<Q> list = new ArrayList<Q>();
        list.add(new Q1(bufferedReader));
        list.add(new Q2(bufferedReader));
        list.add(new Q3(bufferedReader));
        list.add(new Q4(bufferedReader));
        list.add(new Q5(bufferedReader));
        list.add(new Q6(bufferedReader));
        list.add(new Q7(bufferedReader));
        list.add(new Q8(bufferedReader));
        list.add(new Q9(bufferedReader));
        list.add(new Q10(bufferedReader));
        Collections.shuffle(list);

        for(int i = 0; i < list.size(); ++i){
//            int m = i + 1;
//            System.out.println("\n    第"+ m  +"問！！");
            list.get(i).inform(i);
        }
    }
}
