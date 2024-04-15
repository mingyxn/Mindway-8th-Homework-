public class Main{
    public static void main(String[] args) {
        String word = "마인드웨이";
        int length = word.length();
        
        for (int i = 0; i < length; i++) {
            // 첫 번째 반복에서는 마지막 글자를 출력
            for (int j = i; j < length; j++) {
                System.out.print(word.charAt(j));
            }
            // 두 번째 반복에서는 처음부터 현재 인덱스 직전까지 출력
            for (int j = 0; j < i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println(); // 줄 바꿈
        }
    }
}