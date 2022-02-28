import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

class �N�C�Y10�� {
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
            String message = "    �n�Y���A������x�l���Ă݂Ă�";

            try {
                String buf = bufferedReader.readLine();
                answer = Integer.parseInt(buf);
            }
            catch (Exception exception) {
                answer = 0;
                message = "    ������ԍ��œ��͂��ĉ�����";
            }
            if (check(answer)) {
                message = "    �����A�ǂ��o���܂���";
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
            System.out.println("\n    ��1��I�I");
            System.out.println("    �A�����J�̎�s�͂ǂ��ł����H");
            System.out.println("    1:�j���[���[�N");
            System.out.println("    2:���V���g�� D.C.");
            System.out.println("    3:���T���W�F���X");
            System.out.println("    ������ԍ��œ��͂��A�G���^�[�L�[�������Ă��������B��");
    }

    public boolean check(int answer) {
        return answer == 2;
    }
}

class Q2 extends Q {
    Q2(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    ��2��I�I");
            System.out.println("    �t�����X�̎�s�͂ǂ��ł����H");
            System.out.println("    1:�p��");
            System.out.println("    2:�j�[�X");
            System.out.println("    3:�J���k");
            System.out.println("    ������ԍ��œ��͂��A�G���^�[�L�[�������Ă��������B��");
    }

    public boolean check(int answer) {
        return answer == 1;
    }
}

class Q3 extends Q {
    Q3(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    ��3��I�I");
            System.out.println("    ���{�̎�s�͂ǂ��ł����H");
            System.out.println("    1:����");
            System.out.println("    2:���");
            System.out.println("    3:���s");
            System.out.println("    ������ԍ��œ��͂��A�G���^�[�L�[�������Ă��������B��");
    }

    public boolean check(int answer) {
        return answer == 1;
    }
}
class Q4 extends Q {
    Q4(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    ��4��I�I");
            System.out.println("    ���ɂ͉R���K�v�ł���Ƃ������Ƃ����Ƃ���?");
            System.out.println("    1:�R������");
            System.out.println("    2:�R������");
            System.out.println("    3:�R����");
            System.out.println("    ������ԍ��œ��͂��A�G���^�[�L�[�������Ă��������B��");
    }

    public boolean check(int answer) {
        return answer == 2;
    }
}
class Q5 extends Q {
    Q5(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    ��5��I�I");
            System.out.println("    ���̓��̂��Ƃ͐��Ƃ���Ԃł���Ƃ������Ƃ����Ƃ����H");
            System.out.println("    1:�݂͂����g");
            System.out.println("    2:�݂͖݉�");
            System.out.println("    3:�݂͂�����");
            System.out.println("    ������ԍ��œ��͂��A�G���^�[�L�[�������Ă��������B��");
    }

    public boolean check(int answer) {
        return answer == 2;
    }
}
class Q6 extends Q {
    Q6(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    ��6��I�I");
            System.out.println("    �C�J�̑�����{�ł͉��ƌ����邱�Ƃ��������H");
            System.out.println("    1:�Q�\");
            System.out.println("    2:�A�V");
            System.out.println("    3:�E�f");
            System.out.println("    ������ԍ��œ��͂��A�G���^�[�L�[�������Ă��������B��");
    }

    public boolean check(int answer) {
        return answer == 1;
    }
}
class Q7 extends Q {
    Q7(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    ��7��I�I");
            System.out.println("    �O���R���̃W���K�C���̖��O�̗R���́A����ɂ��Ɖ��Ƃ����s�s�ɗR�����Ă���Ƃ��邩�H");
            System.out.println("    1:�W���K�g�E");
            System.out.println("    2:�W���p��");
            System.out.println("    3:�W���J���^");
            System.out.println("    ������ԍ��œ��͂��A�G���^�[�L�[�������Ă��������B��");
    }

    public boolean check(int answer) {
        return answer == 3;
    }
}
class Q8 extends Q {
    Q8(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    ��8��I�I");
            System.out.println("    ���̒��Ńf���v����2�̏����v�f�ŉ��֕�������邩�H");
            System.out.println("    1:�}���R�X");
            System.out.println("    2:�}���g�[�X");
            System.out.println("    3:�}���\�[�X");
            System.out.println("    ������ԍ��œ��͂��A�G���^�[�L�[�������Ă��������B��");
    }

    public boolean check(int answer) {
        return answer == 2;
    }
}
class Q9 extends Q {
    Q9(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    ��9��I�I");
            System.out.println("    ����ō\������銔����Ђ̊�{�I�ȕ��j��d�v������b�������@��");
            System.out.println("    1:���ۘA������");
            System.out.println("    2:���呍��");
            System.out.println("    3:PTA����");
            System.out.println("    ������ԍ��œ��͂��A�G���^�[�L�[�������Ă��������B��");
    }

    public boolean check(int answer) {
        return answer == 2;
    }
}
class Q10 extends Q {
    Q10(BufferedReader br) { super(br); }

    public void question() {
            System.out.println("\n    ��10��I�I");
            System.out.println("    �q�}�����R���ɐ������Ă���ƌ����Ă���S�g�т��炯�̖��m�F�����Ƃ����΁H");
            System.out.println("    1:�X�[��");
            System.out.println("    2:��j");
            System.out.println("    3�C�G�e�B:");
            System.out.println("    ������ԍ��œ��͂��A�G���^�[�L�[�������Ă��������B��");
    }

    public boolean check(int answer) {
        return answer == ;3
		
    }
}