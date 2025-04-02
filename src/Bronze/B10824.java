package Bronze;

import java.util.Scanner;

public class B10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" "); // 입력값을 공백 기준으로 분리

        Long ab = Long.parseLong(input[0] + input[1]);
        Long cd = Long.parseLong(input[2] + input[3]);

        System.out.println(ab + cd);
    }
}
