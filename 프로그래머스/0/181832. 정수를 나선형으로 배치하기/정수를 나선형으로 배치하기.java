class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] dx = {0,1,-1,0};
        int[] dy = {1,0,0,-1};
        int[] pos = {0,0};
        answer[0][0] = 1;
        int num = 2;
        int dir = 0;
        while(num <= n*n){
            if(pos[0]+dx[dir] < n && pos[0]+dx[dir] > -1 && 
               pos[1]+dy[dir] < n && pos[1]+dy[dir] > -1 && // 방향이 범위 안이고
                answer[pos[0]+dx[dir]][pos[1]+dy[dir]] == 0) // 아직 탐색하지 않은 경우
            { 
                pos[0] = pos[0] + dx[dir];
                pos[1] = pos[1] + dy[dir];
                answer[pos[0]][pos[1]] = num;
                num ++;
            } else {
                dir = (dir+1)%4; // 방향 바꾸기
            }
        }
        return answer;
    }
}