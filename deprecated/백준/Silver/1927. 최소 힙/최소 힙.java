import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        while (cnt-- > 0){
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                if(q.isEmpty()){
                    sb.append(0 + "\n");
                } else {
                    sb.append(q.poll() + "\n");
                }
            } else {
                q.offer(num);
            }
        }

        br.close();
        System.out.println(sb.toString());
    }
}