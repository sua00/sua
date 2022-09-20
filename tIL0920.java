import java.util.Arrays;

public class tIL0920{
    public static void main(String[] args) {
        //   평균구하기
        //   점수 : 98점 69점 78점 84점
        //  #1 반복문 사용
        int sum = 0;
        double avg = 0;

        int[] score = {98,69,78,84};
        for(int i = 0; i < score.length; i++) {
            sum += score[i];
            avg = (double)sum/score.length;
        }
        System.out.println(avg);
    

    //   #2 Stream 사용
        double avgStream = Arrays.stream(score).average().orElse(0);
        System.out.println(avgStream);    // 위와 같은 값 출력
    }
}      