package 스킬체크테스트Lv2;

import java.util.Arrays;

public class main2 {

    public static void main(String[] args) {
        int [] people = {70,50,80,50};
        int limit = 100;
        Arrays.sort(people);
        int answer = 0 ;
        for ( int i = 0; i < people.length ; i++ ){
            for ( int j = i+1 ; j <people.length ; j++){
                if ( people[i]+people[j] <= limit){
                    answer++;
                }
            }
        }


        System.out.println(people.length - answer);
    }
}
