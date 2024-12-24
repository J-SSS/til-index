import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {

        List<String> list = new ArrayList<>(Arrays.asList(strings));
        list.sort(Comparator.naturalOrder());
        list.sort(new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return a.charAt(n) - b.charAt(n);
            }
        });

        return list.toArray(String[]::new);
    }
}