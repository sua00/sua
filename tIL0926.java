import java.util.Arrays;
public class tIL0926 {

    public static void main(String[] args){
        // 서울에서 김서방 찾기
        String[] seoul = {"Jane", "Sua", "Kim", "Surim"};
        String answer = "";
        int ans = 0;
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                ans = i;
                answer = "김서방은"+ans+"에 있다";
                break;    // break를 써서 효율성을 높인다
            }        
        }System.out.println(answer);
        // 라이브러리를 사용
        String answer2 = "";
        int x = Arrays.asList(seoul).indexOf("Kim");

         answer2 = "김서방은 "+ x + "에 있다";
         System.out.println(answer2);

         // 전화번호 가리기
        String answer3 = "";
        String answer4 = "";
        String phone_number = "01034567890";
        String[] arr = phone_number.split("");
        for(int  i = 0; i < arr.length-4; i++){
            arr[i] = "*";
        }
        for (int j = 0; j < arr.length; j++){
            answer3 += arr[j];
    } System.out.println(answer3);
    for (int i = 0; i < phone_number.length() - 4; i++)
            answer4 += "*";

        answer4 += phone_number.substring(phone_number.length() - 4);     // substring 이용해서 문자열 자르기
        System.out.println((answer4));
}
}
