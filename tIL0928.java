public class tIL0928 {
        // 가운데 글자 가져오기
        public static void main(String[] args){
            String s = "abcde";
            String answer;
            int n = s.length()/2;
            if(s.length() % 2 == 1){
                answer = s.substring(n,n+1);
            } else {
                answer = s.substring(n-1,n+1);
            }

            System.out.println(answer); // c
            String s2 = "qwer";
            String answer2;
            int i = s2.length()/2;
            if(s2.length() % 2 == 1){
                answer2 = s2.substring(n,n+1);
            } else {
                answer2 = s2.substring(n-1,n+1);
            }

            System.out.println(answer2); // we

        }
    }

