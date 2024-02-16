package thisCodingTest.ch03;

public class Ch3_1 {

    public static void main(String[] args) {

        // 순으로 거스름돈 계산
        // 500 >100 >50 > 10


        int n = 1260;
        int coin[] = {500, 100, 50, 10};
        int i = 0;
        int cnt = 0;


        System.out.println("meCoding cnt :: " + meCoding(n, coin, i, cnt));
        System.out.println("solution cnt :: " + solution());


    }

    static int meCoding(int n, int[] coin, int i, int cnt) {

        while (true) {

            if (n > 0) {
                cnt += n / coin[i];
                n = n % coin[i];
                i++;
                System.out.println("n :: " + n);
            } else {
                System.out.println();
                break;
            }

        }
        return cnt;
    }

    static int solution() {

        int n = 1260;
        int cnt = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for (int i = 0; i < 4; i++) {
            int coin = coinTypes[i];
            cnt += n / coin;
            n %= coin;
        }

        return cnt;
    }
}
