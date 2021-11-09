package DevMatching.lotto;

import java.util.Arrays;

public class Main {

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int win = 7;
        int lose = 7;
        int cnt = 0;
        int cnt2 = 0;

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for(int i : lottos){
            if ( i == 0 ){
                cnt ++;
                continue;
            }

            for ( int j : win_nums) {
                if (i == j) {
                    cnt++;
                    cnt2++;
                    break;
                }
            }
        }

        if ( cnt == 0 ){
            cnt = 1;
        }

        if ( cnt2 == 0 ){
            cnt2 = 1;
        }

        answer = new int[]{win - cnt, lose - cnt2};

        System.out.println(answer[0] +  " , " + answer[1]);
        return answer;
    }

    public static void main(String[] args) {

        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        solution(lottos, win_nums);
    }
}
