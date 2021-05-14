package 썸머코딩코딩테스트;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 프로그래밍2 {
    public static void main(String[] args) {
        int [] t = {0,1,3,0};
        int [] r = {0,1,2,3};

        int [] answer = new int[t.length];

        ArrayList<Integer> an = new ArrayList<>();


        Queue<Printer> q = new LinkedList<>();


        for (int i = 0; i<t.length; i++){
            q.offer(new Printer(i,r[i],t[i]));
        }

        while (!q.isEmpty()){
            boolean flag = false;
            int val = q.peek().value;
            int pri = q.peek().prior;

            //System.out.println(q.poll().location);

            for ( Printer p : q ){
                if (val < p.value){
                    flag = true;
                }
            }

            if (flag){
                q.offer(q.poll());
            }else {
                an.add(q.poll().location);
            }
        }

        for ( int i : an){
            System.out.println(i);
        }
    }

    public static class Printer{
        int location;
        int prior;
        int value;

        Printer(int location,int prior,int value){
            this.location = location;
            this.prior = prior;
            this.value = value;
        }
    }
}
