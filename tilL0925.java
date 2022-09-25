public class tilL0925{
    public static void main(String[] args){
        // x만큼 간격이 있는 n개의 숫자
        int x =2;
        int n =5;
        long[] answer = new long[n];
        for(long i = 0; i < n; i++){
            answer[(int)i] = (long)(x * (i+1));
        }
       
        System.out.println(answer);    // 왜 꺠질까...

        //  나머지가 1이 되는 수 찾기
        int N = 10;
        int answer2 = 0;
        for(int j= 2; j < N; j++){
            if(N % j == 1){
                answer2 = j;
                break;}
            }
            System.out.println(answer2);

        // 클라츠 추측
        int answer3 = 0;
        int Num = 16;
        while (Num != 1){
            if(Num % 2 ==0) {
                Num /= 2;
            }
            else if ( Num % 2 == 1){    // else 붙이고 안 붙이고 런타임 차이가 컸음
                Num = (Num*3)+1;     
            }
            answer3++;
            if(answer3 >= 500){
            answer3 = -1;
                break;     // break필요
        }
        

    }System.out.println(answer3);
}
}
