public class Main {
    public static void main(String[] args) {
        // 프로그래머스_작은 수 제거하기
        int[] arr = {4, 3, 2, 1};
        if (arr.length == 1) {
            int[] answer = {-1};
            System.out.println(answer);
        }
        int[] answer = new int[arr.length - 1];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {    // 배열을 돌며 min 에 최소값 저장
                min = arr[i];
            }
        }
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == min) {
                continue;
            }
            answer[index++] = arr[j];

        }
        System.out.println(answer);    // 왜 또 에러야ㅜㅜㅜㅜ
        // 프로그래머스_음양 더하기
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int[] arr2 = new int[absolutes.length];
        int answer2 = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                arr2[i] = -1 * absolutes[i];
            } else {
                arr2[i] = absolutes[i];
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            answer2 += arr2[j];
        }
        System.out.println(answer2);   // 내 답안

        int answer3 = 0;
        for (int i=0; i<signs.length; i++)
            answer3 += absolutes[i] * (signs[i]? 1: -1);  // true 일때 1 false 일때 -1
        System.out.println(answer3);
        // 프로그래머스_수박수박수
        // 내 답안
        int n = 5;
        String answer4 = "";
        for(int k = 0; k < n; k++){
            if (k % 2 == 0){
                answer4 += "수";
            }
            if (k % 2 == 1){
                answer4 += "박";
            }
        }System.out.println(answer4);
        // 음양 더하기 문제에서 처럼 3항을 이용해 단순화
        String answer5 = "";
        for(int k = 0; k < n; k++)
            answer5 += k % 2 == 0 ? "수" : "박";
        System.out.println(answer5);
    }
}

