package 연습문제.스킬트리;

// 스킬트리 https://programmers.co.kr/learn/courses/30/lessons/49993
public class main {

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            String[] s = skill_trees[i].split("");
            int index = 0;
            boolean ck = true;

            for (int j = 0; j < s.length; j++) {
                if (index < skill.indexOf(s[j])) {
                    ck = false;
                    break;
                } else if (index == skill.indexOf(s[j])) {
                    index++;
                }
            }

            if (ck) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

       int a = solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});

       System.out.println(a);

    }
}
