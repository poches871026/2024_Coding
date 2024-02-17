package thisCodingTest.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ch3_2 {

    public static void main(String[] args) throws IOException {


        // 첫줄은 n 2보다 크다 1000보다 작다, m 1보다 크고 10000보다 작다 ,k 1보다 크고 10000보다 작다
        // 두번쨰줄 1보다 크고 10000 이하의수
        // k는 m보다 작거나 같아야한다

        // 합계는 첫줄에서 젤 큰수 두번째 줄에서 제일 큰수 합한 값

        // 1. n 2보다 커야함 m >= k
        // 2. 입력값 제외


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        System.out.println("n ::: " + n);
        System.out.println("m ::: " + m);
        System.out.println("k ::: " + k);

        /*if(n > 1 n < 1000) {
            System.out.printf("n은 1보다 크거나 1000 보다 작아야 합니다. ::: " + n);
        }*/

        int[] arr = new int[n];
        System.out.println("arr :: " + arr.length);
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            System.out.println("arr[] i :: " + i + " :::: " + arr[i]);
        }
    }
}
