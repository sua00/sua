public class practic {
    public static void main(String[] args){
    long n = 12234;
    int cnt = 0;
    int[] answer = new int[str.length()];

    String str =String.valueOf(n);     // long형 n을 String형을 변형 -> long 상태에서는 길이를 구하기가 힘듦
    while (n>0) {
        answer[cnt] = (int)(n%10);
        n /= 10;
        cnt++;
    }
    System.out.println(answer);
}
}