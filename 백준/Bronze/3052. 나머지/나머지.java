import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            h.add(sc.nextInt() % 42);
            // 입력 받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
        }
        System.out.println(h.size());
    }
}