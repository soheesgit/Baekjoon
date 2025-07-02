package stack;

import java.io.*;
import java.util.ArrayList;

public class B10828 {
    static ArrayList<Integer> st = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.startsWith("push")) {
                String[] arr = s.split(" ");
                push(Integer.parseInt(arr[1]));
            } else if (s.equals("top")) {
                bw.write(String.valueOf(top()));
                bw.newLine();
            } else if (s.equals("pop")) {
                bw.write(String.valueOf(pop()));
                bw.newLine();
            } else if (s.equals("size")) {
                bw.write(String.valueOf(size()));
                bw.newLine();
            } else if (s.equals("empty")) {
                bw.write(String.valueOf(empty()));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }

    static void push(int num) {
        st.add(num);
    }

    static int pop() {
        if (st.isEmpty()) {
            return -1;
        } else {
            return st.remove(st.size() - 1);
        }
    }

    static int top() {
        if (st.isEmpty()) {
            return -1;
        } else {
            return st.get(st.size() - 1);
        }
    }

    static int size() {
        return st.size();
    }

    static int empty() {
        return st.isEmpty() ? 1 : 0;
    }
}
