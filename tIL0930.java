public class tIL0930 {
    public static void main(String[]args){
        // 프로그래머스 약수의 개수와 덧셈
        int left = 13;
        int right = 17;
        int answer = 0;
        for (int i = left; i <= right ; i++){
        int sqrt = (int)Math.sqrt(i);
            if(sqrt * sqrt == i){
                answer -= i;
            } else{
                answer += i;
            }
            
    } System.out.println(answer);

    // 프로그래머스 부족한 금액 계산하기
    int price = 3;
    int money = 20;
    int count = 4;
    long answer2 = 0;
        long sum = 0;
        for(int i = 1; i <= count; i++){
            sum += (long)price * i;
        }
        answer2 = (long)(sum - money);
        if(answer2 <= 0){
            answer2 = 0;
        }
        System.out.println(answer2);
    }
}
