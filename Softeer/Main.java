import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String secret = sc.next();
        int n = sc.nextInt();
        String msg = sc.next();
        int[] change = new int[msg.length()];
        int[] answer = new int[msg.length()];
        String ans = "";

        char ch = 0;
        // 암호화
//        if(s.equals("encrypt")) {
//            for (int i = 0; i < msg.length(); i++) {
//                change[i]=msg.charAt(i)-'a'+secret.charAt(i)-'a';
//
//                if (change[i]>26) change[i]-=26;
//                for (int j = 0; j < change.length; j++) {
//                    answer[j]=change[(j+n)% change.length];
//                }
//            }
//            for (int i = 0; i < answer.length; i++) {
//                ch = (char)(answer[i]+97);
//                ans= String.valueOf(ch);
//                System.out.print(ans);
//            }
//        }

        // 복호화
        if (s.equals("decrypt")) {
            for (int i = 0; i < msg.length(); i++) {
                change[i]=msg.charAt(i)-'a';
                if (change[i]>26) change[i]-=26;
                for (int j = 0; j < change.length; j++) {
                    answer[(j+n)% change.length]=change[j];
                }
                answer[i]=secret.charAt(i)-'a'+answer[i];
            }
            for (int i = 0; i < answer.length; i++) {
                ch = (char)(answer[i]+97);
                ans= String.valueOf(ch);
                System.out.print(ans);
            }

        }
        System.out.println();
    }
}
