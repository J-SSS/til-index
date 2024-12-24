import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0 ; i < n ; i++){
            String str = Integer.toBinaryString(arr1[i]|arr2[i])
                .replaceAll("1","#").replaceAll("0"," ");
            
            if(str.length() < n){
                while(n - str.length() > 0){
                    str = " " + str;
                }
            } 
            answer[i] = str;
        }

        return answer;
    }
}