import java.util.Scanner;

public class everyoneLovesToSleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Number of alarms
            int H = scanner.nextInt(); // Hours Vlad went to bed
            int M = scanner.nextInt(); // Minutes Vlad went to bed

            int[] alarmTimes = new int[n];
            for (int j = 0; j < n; j++) {
                int hi = scanner.nextInt();
                int mi = scanner.nextInt();
                alarmTimes[j] = hi * 60 + mi;
            }

            int result = calculateSleepTime(H, M, alarmTimes);
            System.out.println(result / 60 + " " + result % 60);
        }
    }

    // Function to calculate the sleep time
    static int calculateSleepTime(int H, int M, int[] alarmTimes) {
        int bedtime = H * 60 + M;
        int minDifference = Integer.MAX_VALUE;

        for (int alarm : alarmTimes) {
            int difference = (alarm - bedtime + 24 * 60) % (24 * 60);
            minDifference = Math.min(minDifference, difference);
        }

        return minDifference;
    }
}

