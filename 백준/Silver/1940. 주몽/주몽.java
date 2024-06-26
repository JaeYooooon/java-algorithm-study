import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] arr = new int[N];
    for(int i = 0; i < N; i++){
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    int s = 0;
    int t = N - 1;
    int cnt = 0;

    while(s < t){
      if(arr[s] + arr[t] < M){
        s++;
      }
      else if (arr[s] + arr[t] > M){
        t--;
      }else {
        cnt++;
        s++;
        t--;
      }
    }
    System.out.println(cnt);
  }
}