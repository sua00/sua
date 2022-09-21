public class tIL0921 {
    // 정수 각 자리 수의 합 구하기
    public static void main(String[] args){    
    int n = 567;
    int num = 0;
    int answer = 0;
    String N = Integer.toString(n);    // 정수 n을 string으로 바꾼 후
    int[] arr = new int[N.length()];    
    for(int i =0; i < N.length();i++) {
        num = (int)N.charAt(i) - '0';    // 각각을 다시 int 로 바꾸어 배열 생셩
        arr[i] = num;     // 배열의 합으로 answer 구함
         } 
         for(int j = 0; j < arr.length; j++){     // 처음 실수 했던 점 : 위의 for 문이 닫히고 다른 for 문 임에도 위의 i를 사용할려고 했다.
            answer += arr[j];    
         }
System.out.println(answer);
/*  처음 생각 했던 코드이나, 시간이 좀 오래걸렸다
* 코드를 작성하면서도 효율적인 면에서 고민이 되었으나, 처음 구상 했던 데로 끝까지 완성하고 싶어서 해보았다
*/
         // 더 효율적이라고 생각한 문자열 변환 방식
         int answer2 = 0;
         String s = String.valueOf(n);    // 정수 n 을 STring으로 전환
         for(int i = 0; i< s.length(); i++) {
            answer2 += Integer.parseInt(s.substring(i,i+1));    // 문자열의 추출을 이용 문자열상태에서 int로 변형 (i,i+1)이라는 점화식을 사용한게 신기했다.
         }
         System.out.println(answer2);    // 위와 같은 값 출력

         // 정수 나눗셈을 이용한 방식 (10으로 나누었을 때 나머지가 곳 자릿수)
         int answer3 = 0;
         while(n != 0) {    // 처음에 n > 0 이라했지만 생각헤보니 != 이 더 맞는 것 같다
            answer3 += n % 10;
            n /= 10;    // n을 10으로 나눈 후 다시 n에 대입
         }
         System.out.println(answer3);
        }
}

 


