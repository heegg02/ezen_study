package programers;
//n의 배수
class Problem0_016 {
    public int solution(int num, int n) {
        int answer = 0;
        if(num%n==0) {
             answer = 1;
        }
        return answer;
    }
}