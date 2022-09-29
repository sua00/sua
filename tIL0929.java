public class tIL0929 {
    // 프로그래머스_내적 구하기
    public static void main(String[] args){
    int[] a = {1,2,3,4};
    int[] b = {-1,-0,1,2};
    int answer = 0;
    for(int i = 0; i < a.length; i++){
        answer += a[i] * b[i];
    }
    System.out.println(answer);
 } 
} 

    


