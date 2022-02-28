import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

class クイズ10問 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        Q[] question = new Q[10];

        question[0] = new Q1(bufferedReader);
        question[1] = new Q2(bufferedReader);
        question[2] = new Q3(bufferedReader);
        question[3] = new Q4(bufferedReader);
        question[4] = new Q5(bufferedReader);
		question[5] = new Q6(bufferedReader);
        question[6] = new Q7(bufferedReader);
        question[7] = new Q8(bufferedReader);
        question[8] = new Q9(bufferedReader);
        question[9] = new Q10(bufferedReader);

        for(int i = 0; i < question.length; i++){
            question[i].inform();
        }
    }
}

class Q {
    BufferedReader bufferedReader;

    Q(BufferedReader br) { bufferedReader = br; }

    public void inform() {
        while (true) {
            question();
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

    public void question() { }
    public boolean check(int answer) { return false; }
}

class Q1 extends Q {
    Q1(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    第1問！！");
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

class Q2 extends Q {
    Q2(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    第2問！！");
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

class Q3 extends Q {
    Q3(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    第3問！！");
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
class Q4 extends Q {
    Q4(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    第4問！！");
            System.out.println("    時には嘘も必要であるということを何という?");
            System.out.println("    1:嘘も方言");
            System.out.println("    2:嘘も方便");
            System.out.println("    3:嘘も報告");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }

    public boolean check(int answer) {
        return answer == 2;
    }
}
class Q5 extends Q {
    Q5(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    第5問！！");
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
class Q6 extends Q {
    Q6(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    第6問！！");
            System.out.println("    イカの足を日本では何と言われることが多いか？");
            System.out.println("    1:ゲソ");
            System.out.println("    2:アシ");
            System.out.println("    3:ウデ");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }

    public boolean check(int answer) {
        return answer == 1;
    }
}
class Q7 extends Q {
    Q7(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    第7問！！");
            System.out.println("    外国由来のジャガイモの名前の由来は、一説によると何という都市に由来しているといるか？");
            System.out.println("    1:ジャガトウ");
            System.out.println("    2:ジャパン");
            System.out.println("    3:ジャカルタ");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }

    public boolean check(int answer) {
        return answer == 3;
    }
}
class Q8 extends Q {
    Q8(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    第8問！！");
            System.out.println("    口の中でデンプンは2の消化要素で何へ分解されるか？");
            System.out.println("    1:マルコス");
            System.out.println("    2:マルトース");
            System.out.println("    3:マルソース");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }

    public boolean check(int answer) {
        return answer == 2;
    }
}
class Q9 extends Q {
    Q9(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    第9問！！");
            System.out.println("    株主で構成される株式会社の基本的な方針や重要事項を話し合う機関");
            System.out.println("    1:国際連合総会");
            System.out.println("    2:株主総会");
            System.out.println("    3:PTA総会");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }

    public boolean check(int answer) {
        return answer == 2;
    }
}
class Q10 extends Q {
    Q10(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    第10問！！");
            System.out.println("    ヒマラヤ山脈に生息していると言われている全身毛だらけの未確認動物といえば？");
            System.out.println("    1:スーモ");
            System.out.println("    2:雪男");
            System.out.println("    3イエティ:");
            System.out.println("    答えを番号で入力し、エンターキーを押してください。→");
    }

    public boolean check(int answer) {
        return answer == ;3
		
    }
}