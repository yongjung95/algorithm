package 연습문제.나라의숫자;

// 124 나라의 숫자 https://programmers.co.kr/learn/courses/30/lessons/12899
public class main {
    public static void main(String[] args) {
        String[] numbers = {"4", "1", "2"};
        String answer = "";

        int num = 5;

        while(num > 0){
            int remainder = num % 3;
            num /= 3;

            if(remainder == 0) num--;

            answer = numbers[remainder] + answer;
        }

        System.out.println(answer);
    }
}
