package 완전탐색.모의고사;

import java.util.ArrayList;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int [] supo1 = {1,2,3,4,5};
        int [] supo2 = {2,1,2,3,2,4,2,5};
        int [] supo3 = {3,3,1,1,2,2,4,4,5,5};

        int [] answers = {1,2,3,4,5};

        int [] points = new int[3];
        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        for ( int i = 0; i < answers.length ; i++){
            if (answers[i] == supo1[i%5]){
                points[0]++;
            }
            if (answers[i] == supo2[i%8]){
                points[1]++;
            }
            if (answers[i] == supo3[i%10]){
                points[2]++;
            }
        }

        int b = points[0];


        for ( int i = 0 ; i<points.length ; i++ ){
            if ( b <= points[i]){
                b = points[i];
            }
        }

        for ( int i = 0 ; i<points.length ; i++ ){
            if ( points[i] == b){
                arraylist.add(i+1);
            }
        }

        int[] answer = new int[arraylist.size()];
        for(int i=0; i<arraylist.size(); i++) {
            answer[i] = arraylist.get(i);
        }

        Arrays.sort(answer);

        for ( int i = 0; i<answer.length ; i++){
            System.out.println(answer[i]);
        }


    }
}
