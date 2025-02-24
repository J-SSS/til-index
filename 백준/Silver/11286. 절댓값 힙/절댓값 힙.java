import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                Comparator
                .comparing((Integer e)-> Math.abs(e))
                .thenComparing((Integer e)-> e)
        );
        while (cnt-- > 0){
            int val = Integer.parseInt(br.readLine());
            if(val != 0){
                pq.add(val);
            } else {
                if(pq.size() > 0){
                    sb.append(pq.poll()).append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
