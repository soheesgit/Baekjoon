package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;


public class B9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        for (int i = 0; i < num1; i++) {
            String result = "YES";
            String s = br.readLine();

            Stack<String> st = new Stack<>();

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(') {
                    st.add("(");
                } else if (c == ')') {
                    if (st.isEmpty()) {
                        result = "NO";
                        break;
                    } else {
                        st.pop();
                    }
                }
            }

            if (!st.isEmpty()) {
                result = "NO";
            }
            System.out.println(result);
        }
    }
}
