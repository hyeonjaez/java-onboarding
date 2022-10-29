package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();
        int putmoney = money;

        if(!NumberCheck(money)){
            throw new IllegalArgumentException("1 이상 1000000 이하로 입력 해주세요.");
        }
        List<Integer> coin = List.of(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1);

        for(int c : coin){
            int cnt = putmoney/c;
            answer.add(cnt);
            putmoney %= c;
        }
            return answer;
        }
    public static boolean NumberCheck(int money){
        if(1 <= money & money <= 1000000){
            return true;
        }else{
            return false;
        }
    }
}

