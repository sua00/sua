public class tIL0924 {
    public static void main(String[] args){
        long n = 12345;
        String answer = "";
        String str = Long.toString(n);
        
        int[] arr = new int[str.length()];
        
        //long타입의 숫자를 Int배열로 올긴다.
        for(int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i+1);
            arr[i] = Integer.psarseInt(s);
        }
        
        //내림차순 정렬
        for(int j = 0; j < str.length()-1; j++){
            for(int i = 0; i < str.length()-1; i++) {
                if (arr[i] < arr[i+1]) {
                    int tmp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        
        for(int i = 0; i < str.length(); i++){
            answer += arr[i];
        }
        System.out.println(answer);
    }
}
